package com.turkcell.rentacar.dataAccess.abstracts;

import com.turkcell.rentacar.entities.concretes.Car;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CarDao extends JpaRepository<Car, Integer> {
    List<Car> getByDailyPriceIsLessThanEqual(double dailyPrice);
    List<Car> getByModelYearIsLessThanEqual(int modelYear);
}
