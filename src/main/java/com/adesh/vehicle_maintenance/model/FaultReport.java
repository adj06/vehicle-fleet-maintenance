package com.adesh.vehicle_maintenance.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

@Entity
public class FaultReport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne // many fault reports belong to one vehicle
    @JoinColumn(name = "vehicle_id")
    @NotNull(message = "Vehicle can't be null")
    private Vehicle vehicle;

    @NotNull(message = "Fault status can't be null")
    @Enumerated(EnumType.STRING)
    private FaultStatus status;

    @NotBlank(message = "description can't be blank")
    private String description;

    @NotNull(message = "Severity can't be null")
    @Enumerated(EnumType.STRING)
    private VehicleSeverity severity;


    @NotNull(message = "Date can't be null")
    private LocalDate reportedDate;

    public FaultReport(Long id, Vehicle vehicle, String description, VehicleSeverity severity, FaultStatus status, LocalDate reportedDate){
        this.id = id;
        this.vehicle = vehicle;
        this.description = description;
        this.severity = severity;
        this.status = status;
        this.reportedDate = reportedDate;
    }

    public FaultReport() {

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

    public FaultStatus getStatus() {
        return status;
    }

    public void setStatus(FaultStatus status) {
        this.status = status;
    }

    public LocalDate getReportedDate() {
        return reportedDate;
    }

    public void setReportedDate(LocalDate reportedDate) {
        this.reportedDate = reportedDate;
    }
}
