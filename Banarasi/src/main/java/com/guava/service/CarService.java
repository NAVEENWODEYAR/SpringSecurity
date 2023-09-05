package com.guava.service;

import com.guava.dto.CarRequest;
import com.guava.modal.Car;
import com.guava.repo.CarRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService
{
    // Dependency Injection(constructor)
    @Autowired
    private CarRepo carRepo;

    // Business logic
    public String getMsg()
    {
        return "Guava fruit is rich in vitamin C, which is known for its ability to kill disease-causing microbes and boost immunity.";
    }

    // INSERT INTO car VALUES()
    public Car insertCar(CarRequest carRequest)
    {
        Car car = new Car(carRequest);
            return carRepo.save(car);
    }

    // SELECT * FROM car;
    public List<Car> getCars()
    {
        List<Car> car = carRepo.findAll();
        return car;
    }
}
