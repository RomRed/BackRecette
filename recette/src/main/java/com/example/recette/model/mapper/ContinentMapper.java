package com.example.recette.model.mapper;

import com.example.recette.model.dto.ContinentDto;
import com.example.recette.model.entity.Continent;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface ContinentMapper {
    Continent toEntity(ContinentDto continentDto);

    ContinentDto toDto(Continent continent);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Continent partialUpdate(ContinentDto continentDto, @MappingTarget Continent continent);
}