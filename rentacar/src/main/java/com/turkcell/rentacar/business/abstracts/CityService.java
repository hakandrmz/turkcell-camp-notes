package com.turkcell.rentacar.business.abstracts;

import java.util.List;

import com.turkcell.rentacar.business.dtos.city.CityByIdDto;
import com.turkcell.rentacar.business.dtos.city.CityListDto;
import com.turkcell.rentacar.business.requests.city.CreateCityRequest;
import com.turkcell.rentacar.business.requests.city.UpdateCityRequest;
import com.turkcell.rentacar.core.exceptions.BusinessException;
import com.turkcell.rentacar.core.utilities.results.DataResult;
import com.turkcell.rentacar.core.utilities.results.Result;

public interface CityService {
    DataResult<List<CityListDto>> getAll();
    Result add(CreateCityRequest createCityRequest);
    DataResult<CityByIdDto> getById(int id);
    Result update(UpdateCityRequest updateCityRequest);
    Result deleteById(int cityId);
}
