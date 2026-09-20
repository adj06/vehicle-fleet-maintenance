package com.adesh.vehicle_maintenance.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Registration can't be blank")
    private String registration;

    @NotBlank(message = "Make can't be blank")
    private String make;

    @NotBlank(message = "Model can't be blank")
    private String model;

    @NotNull(message = "Year can't be null")
    @Min(value=1900, message = "Minimum year has to be the year 1900")
    @Max(value=2027, message = "Maximum year has to be the year 2027")
    private Integer year;

    @NotNull(message = "Mileage value can't be null")
    @Min(value = 0, message = "Mileage can't be negative")
    @Max(value = 150000, message = "Mileage has to be maximum of 150000")
    private Integer mileage;

    @NotNull(message = "Vehicle status can't be null")
    @Enumerated(EnumType.STRING)
    private VehicleStatus status;

    public Vehicle(Long id, String registration, String make, String model, Integer year, Integer mileage, VehicleStatus status){
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

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getMileage() {
        return mileage;
    }

    public void setMileage(Integer mileage) {
        this.mileage = mileage;
    }

    public VehicleStatus getStatus() {
        return status;
    }

    public void setStatus(VehicleStatus status) {
        this.status = status;
    }
}

