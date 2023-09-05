package com.guava.controller;

import com.guava.dto.CarRequest;
import com.guava.modal.Car;
import com.guava.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/car")
public class CarController
{
    // DI
    @Autowired
    private CarService carService;

    // API's
    @GetMapping("/test")
    public String getMsg()
    {
        return carService.getMsg();
    }

    @PostMapping
    public Car insertCar(@RequestBody CarRequest carRequest)
    {
        Car car = new Car(carRequest);
            return carService.insertCar(carRequest);
    }

    @GetMapping
    public List<Car> getCars()
    {
        List<Car> cars = carService.getCars();
        return cars;
    }
}
