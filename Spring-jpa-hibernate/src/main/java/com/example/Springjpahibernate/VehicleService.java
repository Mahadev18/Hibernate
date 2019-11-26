package com.example.Springjpahibernate;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehicleService {

	@Autowired
	private VehicleRepository vehiclerepository;

	public List<Vehicle> getVehicles() {
		
		return (List<Vehicle>) vehiclerepository.findAll(); 
		
	}

	public void updateVehicle(Vehicle vehicle, int location_id) {
		vehiclerepository.save(vehicle);
		
	}
	
	
}
