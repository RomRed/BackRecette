package com.gestionrecettes.back.model.mapper;

import com.gestionrecettes.back.model.dto.ContinentDto;
import com.gestionrecettes.back.model.entity.Continent;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ContinentMapper {

    ContinentDto toDto(Continent continent);

    Continent toEntity(ContinentDto continentDto);

    List<ContinentDto> toDtoList(List<Continent> continents);

    List<Continent> toEntityList(List<ContinentDto> continentDtos);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Continent partialUpdate(ContinentDto continentDto, @MappingTarget Continent continent);
}
