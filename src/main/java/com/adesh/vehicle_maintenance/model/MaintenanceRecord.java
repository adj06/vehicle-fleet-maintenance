package com.adesh.vehicle_maintenance.model;

import com.sun.tools.javac.Main;

import java.time.LocalDate;

public class MaintenanceRecord {

    private Long id;
    private Vehicle vehicle;
    private String description;
    private VehicleSeverity severity;
    private VehicleStatus status;
    private LocalDate reportedDate;

    public MaintenanceRecord(Long id, Vehicle vehicle, String description, VehicleSeverity severity, VehicleStatus status, LocalDate reportedDate){
        this.id = id;
        this.vehicle = vehicle;
        this.description = description;
        this.severity = severity;
        this.status = status;
        this.reportedDate = reportedDate;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public VehicleSeverity getSeverity() {
        return severity;
    }

    public void setSeverity(VehicleSeverity severity) {
        this.severity = severity;
    }

    public VehicleStatus getStatus() {
        return status;
    }

    public void setStatus(VehicleStatus status) {
        this.status = status;
    }

    public LocalDate getReportedDate() {
        return reportedDate;
    }

    public void setReportedDate(LocalDate reportedDate) {
        this.reportedDate = reportedDate;
    }
}
