package com.EmSoft.VBO.Business;

import java.util.List;

import com.EmSoft.VBO.Entities.Vehicles;

public interface IVehiclesService {

	List<Vehicles> getAll();
    void add(Vehicles vehicles);
    void update(Vehicles vehicles);
    void delete(Vehicles vehicles);
    Vehicles getById(int id);
	
}
