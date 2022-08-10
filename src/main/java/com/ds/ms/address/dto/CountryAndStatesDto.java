package com.ds.ms.address.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public record CountryAndStatesDto(Long id, String name, String iso3, String iso2, Integer numericCode, String phoneCode,
                                  String capital, String currency, String currencyName, String currencySymbol,
                                  String tld, String nativeField, String region, String subregion, String timezones,
                                  BigDecimal latitude, BigDecimal longitude, String emoji,
                                  List<StateWithoutCountryDto> states) implements Serializable {
}
