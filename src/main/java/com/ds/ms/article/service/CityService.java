package com.ds.ms.article.service;

import com.ds.ms.article.dto.CityDto;
import com.ds.ms.article.dto.CountryDto;
import com.ds.ms.article.exceptions.EntityNotFoundException;

import java.util.List;

public interface CityService {

    CityDto findById(Long id) throws EntityNotFoundException;
    Long count();
    CityDto findByName(String name) throws EntityNotFoundException;
}
