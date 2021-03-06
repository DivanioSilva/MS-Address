package com.ds.ms.article.dto;

import com.ds.ms.article.dto.CountryDto;
import com.ds.ms.article.dto.StateDto;

import java.io.Serializable;
import java.math.BigDecimal;

public record CityDto(Long id, String name, Integer stateId, String stateCode, String stateName, Integer countryId,
                      String countryCode, String countryName, BigDecimal latitude, BigDecimal longitude, StateDto state) implements Serializable {
}
