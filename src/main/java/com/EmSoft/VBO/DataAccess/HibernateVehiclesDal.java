package com.EmSoft.VBO.DataAccess;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.EmSoft.VBO.Entities.Vehicles;

import jakarta.persistence.EntityManager;

@Repository
public class HibernateVehiclesDal implements IVehiclesDal {

	private EntityManager entityManager;
	
	@Autowired
	public HibernateVehiclesDal(EntityManager entityManager) {
		super();
		this.entityManager = entityManager;
	}

	@Override
	public List<Vehicles> getAll() {
		Session session=entityManager.unwrap(Session.class);
		List<Vehicles> vehicles=session.createQuery("from Vehicles",Vehicles.class).getResultList();
		return vehicles;
	}

	@Override
	public void add(Vehicles vehicles) {
		Session session = entityManager.unwrap(Session.class);
		session.merge(vehicles);
		
	}

	@Override
	public void update(Vehicles vehicles) {
		Session session = entityManager.unwrap(Session.class);
		session.merge(vehicles);
		
	}

	@Override
	public void delete(Vehicles vehicles) {
		Session session = entityManager.unwrap(Session.class);
		session.remove(vehicles);
		
		
	}

	@Override
	public Vehicles getById(int id) {
		Session session=entityManager.unwrap(Session.class);
		Vehicles vehicles =session.get(Vehicles.class,id);
		   return vehicles;
	}

	
	
	
	
	
}
