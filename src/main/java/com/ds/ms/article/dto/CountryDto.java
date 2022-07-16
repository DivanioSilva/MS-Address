package com.ds.ms.article.dto;

import com.ds.ms.article.dto.StateDto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public record CountryDto(Long id, String name, String iso3, String iso2, int numericCode, String capital,
                         String currency, String currencyName, String currencySymbol, String tld, String nativeC,
                         String region, String subRegion, String timeZone, BigDecimal latitude, BigDecimal longitude,
                         String emoji, List<StateDto> states) implements Serializable {
}
