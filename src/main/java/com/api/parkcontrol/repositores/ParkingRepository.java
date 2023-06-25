package com.api.parkcontrol.repositores;

import com.api.parkcontrol.models.ParkingModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParkingRepository extends JpaRepository<ParkingModel, Long> {
}
