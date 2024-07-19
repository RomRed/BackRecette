package com.example.recette.model.dto;

import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link com.example.recette.model.entity.Continent}
 */
@Value
public class ContinentDto implements Serializable {
    Integer id;
    String libContinent;
}