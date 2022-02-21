package com.turkcell.rentacar.api.controllers;

import com.turkcell.rentacar.business.abstracts.BrandService;
import com.turkcell.rentacar.business.dtos.BrandListDto;
import com.turkcell.rentacar.business.dtos.GetBrandDto;
import com.turkcell.rentacar.business.requests.*;
import com.turkcell.rentacar.core.utilities.results.DataResult;
import com.turkcell.rentacar.core.utilities.results.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/api/brands")
public class BrandsController {

    private BrandService brandService;

    @Autowired
    public BrandsController(BrandService brandService) {
        this.brandService = brandService;
    }

    @PostMapping("/add")
    public Result add(@RequestBody CreateBrandRequest createBrandRequest) {
        return this.brandService.add(createBrandRequest);
    }

    @GetMapping("/getall")
    public DataResult<List<BrandListDto>> getAll() {
        return this.brandService.getAll();
    }

    @GetMapping("/getByBrandId/{brandId}")
    public DataResult<GetBrandDto> getByBrandId(@RequestParam("brandId") int brandId) {
        return this.brandService.getById(brandId);
    }

    @PutMapping("/update")
    public Result update(@RequestBody UpdateBrandRequest updateBrandRequest) {
        return this.brandService.update(updateBrandRequest);
    }

    @DeleteMapping("/delete")
    public Result delete(@RequestBody DeleteBrandRequest deleteBrandRequest) {
        return this.brandService.delete(deleteBrandRequest);
    }
}
