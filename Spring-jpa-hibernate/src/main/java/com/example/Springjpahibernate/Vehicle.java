package com.example.Springjpahibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table(name = "Vehicle")
@Entity
public class Vehicle {  //POJO

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	int vehicle_id;           
	@Column
    String vehicle_model;         
	@Column
    int FuelCapacity;            
	@Column
    int length;           
	@Column
    int breadth;           
	@Column
    int height;
    
    @ManyToOne 
    @JoinColumn(name = " Location_id ")
    private Location location;
    
	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public Vehicle() {
		super();
	}

	public Vehicle(int vehicle_id, String vehicle_model, int fuelCapacity, int length, int breadth, int height) {
		super();
		this.vehicle_id = vehicle_id;
		this.vehicle_model = vehicle_model;
		FuelCapacity = fuelCapacity;
		this.length = length;
		this.breadth = breadth;
		this.height = height;
	}

	public int getVehicle_id() {
		return vehicle_id;
	}

	public void setVehicle_id(int vehicle_id) {
		this.vehicle_id = vehicle_id;
	}

	public String getVehicle_model() {
		return vehicle_model;
	}

	public void setVehicle_model(String vehicle_model) {
		this.vehicle_model = vehicle_model;
	}

	public int getFuelCapacity() {
		return FuelCapacity;
	}

	public void setFuelCapacity(int fuelCapacity) {
		FuelCapacity = fuelCapacity;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}

	public int getLength() {
		return length;
	}

	public int getHeight() {
		return height;
	}

	@Override
	public String toString() {
		return "Vehicle [vehicle_id=" + vehicle_id + ", vehicle_model=" + vehicle_model + ", FuelCapacity="
				+ FuelCapacity + ", length=" + length + ", breadth=" + breadth + ", height=" + height + ", location="
				+ location + "]";
	}    
    
    

}
