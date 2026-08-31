package com.adesh.vehicle_maintenance.model;

public class Vehicle {

    private Long id;
    private String registration;
    private String make;
    private String model;
    private int year;
    private int mileage;
    private VehicleStatus status;

    public Vehicle(Long id, String registration, String make, String model, int year, int mileage, VehicleStatus status){
        this.id = id;
        this.registration = registration;
        this.make = make;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
        this.status = status;
    }

    public Vehicle(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public VehicleStatus getStatus() {
        return status;
    }

    public void setStatus(VehicleStatus status) {
        this.status = status;
    }
}

