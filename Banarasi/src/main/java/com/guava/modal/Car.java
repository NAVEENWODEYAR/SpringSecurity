package com.guava.modal;

import com.guava.dto.CarRequest;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Car
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int carId;

    private String carMake;
    private String carName;
    private double carPrice;

        //
        public Car(CarRequest carRequest)
        {
            this.carMake = carRequest.getCarMake();
            this.carName = carRequest.getCarName();
            this.carPrice = carRequest.getCarPrice();
        }
}
