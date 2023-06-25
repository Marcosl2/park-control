package com.api.parkcontrol.models;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "TB_PARKING")
public class ParkingModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String licensePlateCar;
    private String modelCar;
    private String colorCar;
    private String responsibleName;
    private String parkingNumber;
    private String apartment;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLicensePlateCar() {
        return licensePlateCar;
    }

    public void setLicensePlateCar(String licensePlateCar) {
        this.licensePlateCar = licensePlateCar;
    }

    public String getModelCar() {
        return modelCar;
    }

    public void setModelCar(String modelCar) {
        this.modelCar = modelCar;
    }

    public String getColorCar() {
        return colorCar;
    }

    public void setColorCar(String colorCar) {
        this.colorCar = colorCar;
    }

    public String getResponsibleName() {
        return responsibleName;
    }

    public void setResponsibleName(String responsibleName) {
        this.responsibleName = responsibleName;
    }

    public String getParkingNumber() {
        return parkingNumber;
    }

    public void setParkingNumber(String parkingNumber) {
        this.parkingNumber = parkingNumber;
    }

    public String getApartment() {
        return apartment;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }
}
