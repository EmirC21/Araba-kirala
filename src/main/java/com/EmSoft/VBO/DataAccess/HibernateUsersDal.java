package com.EmSoft.VBO.DataAccess;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.EmSoft.VBO.Entities.Users;


import jakarta.persistence.EntityManager;
@Repository
public class HibernateUsersDal implements IUsersDal {

	private EntityManager entityManager;

	@Autowired
	public HibernateUsersDal(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	public List<Users> getAll() {
		Session session=entityManager.unwrap(Session.class);
		List<Users> users=session.createQuery("from Users",Users.class).getResultList();
		return users;
	}

	@Override
	public void add(Users users) {
		Session session = entityManager.unwrap(Session.class);
		session.merge(users);
		
	}

	@Override
	public void update(Users users) {
		Session session = entityManager.unwrap(Session.class);
		session.merge(users);
		
	}

	@Override
	public void delete(Users users) {
		Session session = entityManager.unwrap(Session.class);
		session.remove(users);
		
	}

	@Override
	public Users getById(int id) {
		Session session=entityManager.unwrap(Session.class);
		   Users users=session.get(Users.class,id);
		   return users;
	}

}
