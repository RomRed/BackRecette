package com.example.recette.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ingredient_details")
public class IngredientDetails {
    @Id
    @Column(name = "id_ingredient_details", nullable = false)
    private Integer id;

    @Column(name = "lib_ingredient_details", nullable = false, length = 2000)
    private String libIngredientDetails;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLibIngredientDetails() {
        return libIngredientDetails;
    }

    public void setLibIngredientDetails(String libIngredientDetails) {
        this.libIngredientDetails = libIngredientDetails;
    }

}