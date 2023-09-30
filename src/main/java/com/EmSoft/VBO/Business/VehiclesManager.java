package com.EmSoft.VBO.Business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.EmSoft.VBO.DataAccess.IVehiclesDal;
import com.EmSoft.VBO.Entities.Vehicles;

@Service
public class VehiclesManager implements IVehiclesService {

	private IVehiclesDal vehiclesDal;
    @Autowired
	public VehiclesManager(IVehiclesDal vehiclesDal) {
		super();
		this.vehiclesDal = vehiclesDal;
	}
    
	@Override
	@Transactional
	public List<Vehicles> getAll() {
		
		return vehiclesDal.getAll();
	}
	@Override
	@Transactional
	public void add(Vehicles vehicles) {
		this.vehiclesDal.add(vehicles);
		
	}
	@Override
	@Transactional
	public void update(Vehicles vehicles) {
		this.vehiclesDal.update(vehicles);
		
	}
	@Override
	@Transactional
	public void delete(Vehicles vehicles) {
		this.vehiclesDal.delete(vehicles);
		
	}
	@Override
	@Transactional
	public Vehicles getById(int id) {
		
		return vehiclesDal.getById(id);
	}
    
	
}
