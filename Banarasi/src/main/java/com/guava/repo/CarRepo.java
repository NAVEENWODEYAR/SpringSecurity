package com.guava.repo;

import com.guava.modal.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepo extends JpaRepository<Car,Integer>
{

}
