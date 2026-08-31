package com.adesh.vehicle_maintenance.controller;

import com.adesh.vehicle_maintenance.model.Vehicle;
import com.adesh.vehicle_maintenance.service.VehicleService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/vehicles")
public class VehicleController {

    private VehicleService service;

    public VehicleController(VehicleService service){
        this.service = service;
    }

    @GetMapping
    public List<Vehicle> getVehicles(){
        return service.getVehicles();
    }

    @GetMapping("/{id}/status")
    public Vehicle getVehicleById(@PathVariable Long id){
        return service.getVehicleById(id);
    }

}
