package com.adesh.vehicle_maintenance.service;

import com.adesh.vehicle_maintenance.model.Vehicle;
import com.adesh.vehicle_maintenance.repository.VehicleRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleService {

    private VehicleRepository repository;

    public VehicleService(VehicleRepository repository){
        this.repository = repository;
    }

    public List<Vehicle> getVehicles(){
        return repository.findAll().stream().toList();
    }

}
