package com.example.recette.entity;

import javax.persistence.*;

@Entity
@Table(name = "ingredient")
public class Ingredient {
    @Id
    @Column(name = "id_ingredient", nullable = false)
    private Integer id;

    @Column(name = "lib_ingredient", nullable = false, length = 100)
    private String libIngredient;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_categorie_ingredient", nullable = false)
    private CategorieIngredient idCategorieIngredient;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLibIngredient() {
        return libIngredient;
    }

    public void setLibIngredient(String libIngredient) {
        this.libIngredient = libIngredient;
    }

    public CategorieIngredient getIdCategorieIngredient() {
        return idCategorieIngredient;
    }

    public void setIdCategorieIngredient(CategorieIngredient idCategorieIngredient) {
        this.idCategorieIngredient = idCategorieIngredient;
    }

}