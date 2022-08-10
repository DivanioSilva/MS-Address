package com.ds.ms.address.mappers;

import com.ds.ms.address.domain.State;
import com.ds.ms.address.dto.StateDto;
import org.mapstruct.*;
import org.springframework.stereotype.Component;

@Component
@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface StateMapper {
    State stateDtoToState(StateDto stateDto);

    StateDto stateToStateDto(State state);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    State updateStateFromStateDto(StateDto stateDto, @MappingTarget State state);
}
