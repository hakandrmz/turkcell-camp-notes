package com.turkcell.rentacar.business.dtos.additionalservice;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdditionalServiceByIdDto {
    private String additionalServiceName;
    private double dailyPrice;
}
