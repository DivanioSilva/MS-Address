package com.ds.ms.article.mappers;

import com.ds.ms.article.domain.Country;
import com.ds.ms.article.domain.CountrySmallDto;
import com.ds.ms.article.dto.CountryWithoutStatesDto;
import com.ds.ms.article.dto.CountryDto;
import org.mapstruct.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface CountryMapper {
    Country countryDtoToCountry(CountryDto countryDto);

    CountryDto countryToCountryDto(Country country);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Country updateCountryFromCountryDto(CountryDto countryDto, @MappingTarget Country country);

    Country countryWithtoutStatesDtoToCountry(CountryWithoutStatesDto countryWithtoutStatesDto);

    CountryWithoutStatesDto countryToCountryWithtoutStatesDto(Country country);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Country updateCountryFromCountryWithtoutStatesDto(CountryWithoutStatesDto countryWithtoutStatesDto, @MappingTarget Country country);

    List<CountryDto> countryListToCountryDtoList(List<Country> all);
    List<CountrySmallDto> countrySmallDtoListToCountryDtoList(List<Country> all);

    Country countrySmallDtoToCountry(CountrySmallDto countrySmallDto);

    CountrySmallDto countryToCountrySmallDto(Country country);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Country updateCountryFromCountrySmallDto(CountrySmallDto countrySmallDto, @MappingTarget Country country);
}
