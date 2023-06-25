package com.api.parkcontrol.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record ParkingRecordsDto(@NotBlank String licensePlateCar, @NotBlank String modelCar, @NotBlank String colorCar, @NotNull String responsibleName,
                               @NotNull String parkingNumber, @NotNull String apartment) {
}
