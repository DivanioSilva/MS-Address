package com.ds.ms.address.service;

import com.ds.ms.address.dto.CityDto;
import com.ds.ms.address.exceptions.EntityNotFoundException;

public interface CityService {

    CityDto findById(Long id) throws EntityNotFoundException;
    Long count();
    CityDto findByName(String name) throws EntityNotFoundException;
}
