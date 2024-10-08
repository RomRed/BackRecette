package com.gestionrecettes.back.model.mapper;

import com.gestionrecettes.back.model.dto.IngredientRecetteDto;
import com.gestionrecettes.back.model.dto.RegimeRecetteDto;
import com.gestionrecettes.back.model.entity.IngredientRecette;
import com.gestionrecettes.back.model.entity.RegimeRecette;
import org.mapstruct.*;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface RegimeRecetteMapper {
    RegimeRecette toEntity(RegimeRecetteDto regimeRecetteDto);

    RegimeRecetteDto toDto(RegimeRecette regimeRecette);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    RegimeRecette partialUpdate(RegimeRecetteDto regimeRecetteDto, @MappingTarget RegimeRecette regimeRecette);

    List<RegimeRecetteDto> toDtoList(List<RegimeRecette> regimeRecettes);
}