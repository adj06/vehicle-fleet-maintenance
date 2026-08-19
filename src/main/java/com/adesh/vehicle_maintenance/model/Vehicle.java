package com.adesh.vehicle_maintenance.model;

public class Vehicle {

    private Long id;
    private String registration;
    private String make;
    private String model;
    private int year;
    private int mileage;

    public Vehicle(Long id, String registration, String make, String model, int year, int mileage) {
        this.id = id;
        this.registration = registration;
        this.make = make;
        this.model = model;
        this.year = year;
        this.mileage = mileage;

    }
}
