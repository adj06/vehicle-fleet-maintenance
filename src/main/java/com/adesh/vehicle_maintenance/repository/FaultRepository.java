package com.adesh.vehicle_maintenance.repository;

import com.adesh.vehicle_maintenance.model.MaintenanceRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FaultRepository extends JpaRepository<MaintenanceRecord, Long> {
}
