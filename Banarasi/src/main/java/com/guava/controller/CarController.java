package com.guava.controller;

import com.guava.dto.CarRequest;
import com.guava.dto.ResponseDTO;
import com.guava.modal.Car;
import com.guava.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/car")
public class CarController
{
    // DI
    @Autowired
    private CarService carService;

    // API
    @GetMapping("/test")
    public String getMsg()
    {
        return carService.getMsg();
    }

    // Insert into the table,
    @PostMapping
    public ResponseEntity<ResponseDTO> insertCar(@RequestBody CarRequest carRequest)
    {
        Car car = carService.insertCar(carRequest);
        ResponseDTO responseDTO = new ResponseDTO("Car details saved successfully into the database,",car);
            return new ResponseEntity<>(responseDTO, HttpStatus.ACCEPTED);
    }

    // Select * from table,
    @GetMapping
    public ResponseEntity<ResponseDTO>getCars()
    {
        List<Car> cars = carService.getCars();
        ResponseDTO responseDTO = new ResponseDTO("Available cars in the database are",cars);
        return new ResponseEntity<>(responseDTO,HttpStatus.FOUND);
    }
}
