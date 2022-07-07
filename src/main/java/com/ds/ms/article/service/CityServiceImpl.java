package com.ds.ms.article.service;

import com.ds.ms.article.domain.City;
import com.ds.ms.article.dto.CityDto;
import com.ds.ms.article.exceptions.EntityNotFoundException;
import com.ds.ms.article.mappers.CityMapper;
import com.ds.ms.article.repository.CityRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class CityServiceImpl implements CityService{
    private final CityRepository cityRepository;
    private final CityMapper cityMapper;

    @Override
    public CityDto findById(Long id) throws EntityNotFoundException {
        City city = this.cityRepository.findById(id).orElseThrow(EntityNotFoundException::new);
        return this.cityMapper.cityToCityDto(city);
    }

    @Override
    public Long count() {
        return this.cityRepository.count();
    }

    @Override
    public CityDto findByName(String name) throws EntityNotFoundException {
        City city = this.cityRepository.findByName(name).orElseThrow(EntityNotFoundException::new);
        return this.cityMapper.cityToCityDto(city);
    }
}
