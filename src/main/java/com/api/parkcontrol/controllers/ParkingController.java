package com.api.parkcontrol.controllers;

import com.api.parkcontrol.dtos.ParkingRecordsDto;
import com.api.parkcontrol.models.ParkingModel;
import com.api.parkcontrol.repositores.ParkingRepository;

import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/parking")
public class ParkingController {

    final ParkingRepository parkingRepository;
    public ParkingController(ParkingRepository parkingRepository) {
        this.parkingRepository = parkingRepository;
    }
    @GetMapping
    public ResponseEntity <List<ParkingModel>> getAllParking(){
        return ResponseEntity.status(HttpStatus.OK).body(parkingRepository.findAll());
   }
   @PostMapping
   public ResponseEntity<ParkingModel> saveParking(@RequestBody @Valid ParkingRecordsDto parkingRecordsDto){
        var parkingModel = new ParkingModel();
       BeanUtils.copyProperties(parkingRecordsDto,parkingModel);
       return ResponseEntity.status(HttpStatus.CREATED).body(parkingRepository.save(parkingModel));
   }



}
