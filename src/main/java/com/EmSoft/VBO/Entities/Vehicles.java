package com.EmSoft.VBO.Entities;

import jakarta.persistence.*;

@Entity
@Table(name="vehicles")
public class Vehicles {
	
	@Id
	@Column(name="ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ID;
	@Column(name="model")
	private String model;
	@Column(name="brand")
	private String brand;
	@Column(name="year")
	private int year;
	@Column(name="km")
	private int km;
	@Column(name="engine_capacity")
	private int engineCapacity;
	public Vehicles(int iD, String model, String brand, int year, int km, int engineCapacity) {
		super();
		ID = iD;
		this.model = model;
		this.brand = brand;
		this.year = year;
		this.km = km;
		this.engineCapacity = engineCapacity;
	}
	
	public Vehicles() {}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getKm() {
		return km;
	}

	public void setKm(int km) {
		this.km = km;
	}

	public int getEngineCapacity() {
		return engineCapacity;
	}

	public void setEngineCapacity(int engineCapacity) {
		this.engineCapacity = engineCapacity;
	}
	
	
	

}
