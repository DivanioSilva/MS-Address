package com.ds.ms.address.mappers;

import com.ds.ms.address.domain.Country;
import com.ds.ms.address.dto.CountryAndStatesDto;
import com.ds.ms.address.dto.CountrySmallDto;
import com.ds.ms.address.dto.CountryWithoutStatesDto;
import com.ds.ms.address.dto.CountryDto;
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

    CountryAndStatesDto countryToCountryAndStatesDto(Country country);
}