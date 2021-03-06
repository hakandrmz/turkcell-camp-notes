package com.turkcell.rentacar.api.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.*;

import com.turkcell.rentacar.business.abstracts.RentalService;
import com.turkcell.rentacar.business.dtos.rental.RentalDtoById;
import com.turkcell.rentacar.business.dtos.rental.RentalListDto;
import com.turkcell.rentacar.business.requests.rental.CreateRentalRequest;
import com.turkcell.rentacar.business.requests.rental.UpdateRentalRequest;
import com.turkcell.rentacar.core.utilities.results.DataResult;
import com.turkcell.rentacar.core.utilities.results.Result;

@RestController
@RequestMapping("/api/rentals")
public class RentalsController {

	private RentalService rentalService;
	
	
	public RentalsController(RentalService rentalService) {
		this.rentalService = rentalService;
	}

	@GetMapping("/getAll")
	DataResult<List<RentalListDto>> getAll(){
		return this.rentalService.getAll();
		
	}
	
	@GetMapping("/getAllByCarId")
	DataResult<List<RentalListDto>> getAllByCarCarId(int id){
		return this.rentalService.getAllByCarCarId(id);
		
	}
	
	@PostMapping("/add")
	Result add(@RequestBody @Valid CreateRentalRequest createRentalRequest){
		return this.rentalService.add(createRentalRequest);
		
	}
	
	@GetMapping("/getById")
	DataResult<RentalDtoById> getById(int id){
		return this.rentalService.getById(id);
		
	}
	
	@PutMapping("/update")
	Result update(@RequestBody @Valid UpdateRentalRequest updateRentalRequest){
		return this.rentalService.update(updateRentalRequest);
		
	}
	
	@DeleteMapping("/delete")
	Result delete(@RequestParam int rentalId) {
		return this.rentalService.delete(rentalId);
	}
}
