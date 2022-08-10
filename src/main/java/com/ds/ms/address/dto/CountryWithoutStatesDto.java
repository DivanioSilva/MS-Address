package com.ds.ms.address.dto;

import java.io.Serializable;
import java.math.BigDecimal;

public record CountryWithoutStatesDto(Long id, String name, String iso3, String iso2, int numericCode, String capital,
                                      String currency, String currencyName, String currencySymbol, String tld,
                                      String nativeC, String region, String subRegion, String timeZone,
                                      BigDecimal latitude, BigDecimal longitude,
                                      String emoji) implements Serializable {
}
