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
}
