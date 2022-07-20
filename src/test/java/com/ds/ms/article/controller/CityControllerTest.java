package com.ds.ms.article.controller;

import com.ds.ms.article.dto.CityDto;
import com.ds.ms.article.exceptions.EntityNotFoundException;
import com.ds.ms.article.service.CityService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@DisplayName("City Controller")
class CityControllerTest {
    @Mock
    private CityService cityService;

    @InjectMocks
    private CityController cityController;

    @Test
    @DisplayName("Should throw an exception when the id is invalid")
    void findByIdWhenIdIsInvalidThenThrowException() throws EntityNotFoundException {
        when(cityService.findById(anyLong())).thenThrow(EntityNotFoundException.class);
        assertThrows(EntityNotFoundException.class, () -> cityController.findById(1L));
    }

    @Test
    @DisplayName("Should return the city when the id is valid")
    void findByIdWhenIdIsValid() throws EntityNotFoundException {
        CityDto cityDto =
                new CityDto(
                        1L,
                        "New York",
                        1,
                        "NY",
                        "New York",
                        1,
                        "US",
                        "United States",
                        new BigDecimal("40.7142700"),
                        new BigDecimal("-74.0059700"),
                        null);
        when(cityService.findById(anyLong())).thenReturn(cityDto);

        CityDto result = cityController.findById(1L);

        assertEquals(cityDto, result);
    }
}
