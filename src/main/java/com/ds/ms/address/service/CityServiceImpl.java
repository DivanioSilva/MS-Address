package com.ds.ms.address.service;

import com.ds.ms.address.domain.City;
import com.ds.ms.address.dto.CityDto;
import com.ds.ms.address.exceptions.EntityNotFoundException;
import com.ds.ms.address.mappers.CityMapper;
import com.ds.ms.address.repository.CityRepository;
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
