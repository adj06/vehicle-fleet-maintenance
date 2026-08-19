package com.adesh.vehicle_maintenance.model;

public class Vehicle {

    private Long id;
    private String vin;
    private String registration;
    private String status;
    private String vehicleModel;

    public Vehicle(Long id, String vin, String registration, String status, String vehicleModel) {
        this.id = id;
        this.vin = vin;
        this.registration = registration;
        this.status = status;
        this.vehicleModel = vehicleModel;
    }


}
