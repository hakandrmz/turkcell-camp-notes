package com.turkcell.rentacar.business.dtos.car;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CarListDto {
    private int carId;
    private double dailyPrice;
    private int modelYear;
    private String description;
    private String brandName;
    private String colorName;
}
