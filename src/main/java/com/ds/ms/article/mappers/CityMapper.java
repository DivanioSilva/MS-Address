package com.ds.ms.article.mappers;

import com.ds.ms.article.domain.City;
import com.ds.ms.article.dto.CityDto;
import org.mapstruct.*;
import org.springframework.stereotype.Component;

@Component
@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface CityMapper {
    City cityDtoToCity(CityDto cityDto);

    CityDto cityToCityDto(City city);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    City updateCityFromCityDto(CityDto cityDto, @MappingTarget City city);

    City cityDtoToCity1(CityDto cityDto);

    CityDto cityToCityDto1(City city);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    City updateCityFromCityDto1(CityDto cityDto, @MappingTarget City city);

    City cityDtoToCity2(CityDto cityDto);

    CityDto cityToCityDto2(City city);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    City updateCityFromCityDto2(CityDto cityDto, @MappingTarget City city);

    City cityDtoToCity3(CityDto cityDto);

    CityDto cityToCityDto3(City city);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    City updateCityFromCityDto3(CityDto cityDto, @MappingTarget City city);
}
