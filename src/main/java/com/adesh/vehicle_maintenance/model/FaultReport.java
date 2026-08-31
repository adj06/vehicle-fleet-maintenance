package com.adesh.vehicle_maintenance.model;

import com.sun.tools.javac.Main;

import java.time.LocalDate;

public class FaultReport {

    private Long id;
    private Vehicle vehicle;
    private MaintenanceType type;
    private String description;
    private LocalDate date;
    private Double cost;

    public FaultReport(Long id, Vehicle vehicle, MaintenanceType type, String description, LocalDate date, Double cost){
        this.id = id;
        this.vehicle = vehicle;
        this.type = type;
        this.description = description;
        this.date = date;
        this.cost = cost;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public MaintenanceType getType() {
        return type;
    }

    public void setType(MaintenanceType type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }
}
