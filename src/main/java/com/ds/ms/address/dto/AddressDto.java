package com.ds.ms.address.dto;

import com.ds.ms.address.dto.CityDto;

import java.io.Serializable;

public record AddressDto(Long id, String street, String doorNumber, String zipCode,
                         CityDto city) implements Serializable {
}
