package com.EmSoft.VBO.DataAccess;

import java.util.List;

import com.EmSoft.VBO.Entities.Vehicles;



public interface IVehiclesDal {
	
	List<Vehicles> getAll();
    void add(Vehicles vehicles);
    void update(Vehicles vehicles);
    void delete(Vehicles vehicles);
    Vehicles getById(int id);
	

}
