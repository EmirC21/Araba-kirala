package com.EmSoft.VBO.restApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.EmSoft.VBO.Business.IVehiclesService;

import com.EmSoft.VBO.Entities.Vehicles;

@RestController
@RequestMapping("/vehicles")
@CrossOrigin(origins = "http://localhost:3000")
public class VehiclesController {

	private IVehiclesService vehiclesService;

	@Autowired
	public VehiclesController(IVehiclesService vehiclesService) {
		super();
		this.vehiclesService = vehiclesService;
	}
	
	 @GetMapping("/getVehicles")
     public List<Vehicles> get(){
    	 return vehiclesService.getAll();
     }
     @PostMapping("/add")
     public void add(@RequestBody Vehicles vehicles) {
    	 this.vehiclesService.add(vehicles);
     }
     @PostMapping("/delete")
     public void delete(@RequestBody Vehicles vehicles) {
    	 this.vehiclesService.delete(vehicles);
     }
     @PostMapping("/update")
     public void update(@RequestBody Vehicles vehicles) {
    	 this.vehiclesService.update(vehicles);
     }
     @GetMapping("Vehicles/{id}")
     public Vehicles getById(@PathVariable int id) {
    	 return vehiclesService.getById(id);
     }
	
	
	
}
