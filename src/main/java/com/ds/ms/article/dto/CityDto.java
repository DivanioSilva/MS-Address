package com.ds.ms.article.dto;

import java.io.Serializable;

public record CityDto(Long id, String name, Integer stateId, String stateCode, String stateName, Integer countryId,
                      String countryCode, String countryName, String wikiDataId) implements Serializable {
}
