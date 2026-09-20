package com.adesh.vehicle_maintenance.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

@Entity
public class MaintenanceRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne // one vehicle can have many maintenance records
    @JoinColumn(name = "vehicle_id")
    @NotNull(message = "Vehicle can't be null")
    private Vehicle vehicle;

    @NotNull(message = "Maintenance type can't be null")
    @Enumerated(EnumType.STRING)
    private MaintenanceType type;

    @NotBlank(message = "The description can't be blank")
    private String description;

    @NotNull(message = "Date can't be null")
    private LocalDate date;

    @NotNull(message = "Cost can't be null")
    @DecimalMin(value = "0.0", message = "Cost has to be minimum of 0.0")
    private Double cost;

    public MaintenanceRecord(Long id, Vehicle vehicle, MaintenanceType type, String description, LocalDate date, Double cost){
        this.id = id;
        this.vehicle = vehicle;
        this.type = type;
        this.description = description;
        this.date = date;
        this.cost = cost;
    }

    public MaintenanceRecord(){

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
