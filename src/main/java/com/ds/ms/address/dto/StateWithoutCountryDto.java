package com.ds.ms.address.dto;

import java.io.Serializable;
import java.math.BigDecimal;

public record StateWithoutCountryDto(Long id, String name, Integer countryId, String countryCode, String countryName,
                                     String stateCode, String type, BigDecimal latitude,
                                     BigDecimal longitude) implements Serializable {
}
