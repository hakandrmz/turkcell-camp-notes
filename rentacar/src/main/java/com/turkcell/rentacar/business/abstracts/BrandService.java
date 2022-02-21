package com.turkcell.rentacar.business.abstracts;

import com.turkcell.rentacar.business.dtos.BrandListDto;
import com.turkcell.rentacar.business.dtos.GetBrandDto;
import com.turkcell.rentacar.business.requests.CreateBrandRequest;
import com.turkcell.rentacar.business.requests.DeleteBrandRequest;
import com.turkcell.rentacar.business.requests.UpdateBrandRequest;
import com.turkcell.rentacar.core.utilities.results.DataResult;
import com.turkcell.rentacar.core.utilities.results.Result;


import java.util.List;

public interface BrandService {
    DataResult<List<BrandListDto>> getAll();
    Result add(CreateBrandRequest brand);
    DataResult<GetBrandDto> getById(Integer id);
    Result update(UpdateBrandRequest updateBrandRequest);
    Result delete(DeleteBrandRequest deleteBrandRequest);
}
