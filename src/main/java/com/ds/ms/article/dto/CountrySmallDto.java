package com.ds.ms.article.dto;

import java.io.Serializable;

public record CountrySmallDto(Long id, String name, int numericCode, String capital, String currency,
                              String currencyName, String currencySymbol, String emoji) implements Serializable {
}