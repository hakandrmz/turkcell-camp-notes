package com.turkcell.rentacar.business.requests.car;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateCarRequest {

	@NotNull
	@Positive
    private int carId;
	
	@Min(0)
	@NotNull
    private double dailyPrice;
	
	@Min(1950)
	@NotNull
    private int modelYear;
	
    private String description;
    
    @NotNull
    @Positive
    private int brandId;
    
    @NotNull
    @Positive
    private int colorId;
}
