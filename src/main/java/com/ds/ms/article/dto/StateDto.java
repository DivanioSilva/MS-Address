package com.ds.ms.article.dto;

import java.io.Serializable;
import java.math.BigDecimal;

public record StateDto(Long id, String name, Integer countryId, String countryCode, String countryName,
                       String stateCode, String type, BigDecimal latitude,
                       BigDecimal longitude) implements Serializable {
}
