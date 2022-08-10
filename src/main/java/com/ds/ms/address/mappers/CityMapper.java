package com.ds.ms.address.mappers;

import com.ds.ms.address.domain.City;
import com.ds.ms.address.dto.CityDto;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface CityMapper {
    City cityDtoToCity(CityDto cityDto);

    CityDto cityToCityDto(City city);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    City updateCityFromCityDto(CityDto cityDto, @MappingTarget City city);
}
