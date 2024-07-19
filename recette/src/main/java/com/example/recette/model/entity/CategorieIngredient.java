package com.example.recette.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "categorie_ingredient")
public class CategorieIngredient {
    @Id
    @Column(name = "id_categorie_ingredient", nullable = false)
    private Integer id;

    @Column(name = "lib_categorie_ingredient", nullable = false, length = 100)
    private String libCategorieIngredient;

    @Column(name = "icone_categorie", nullable = false)
    private byte[] iconeCategorie;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLibCategorieIngredient() {
        return libCategorieIngredient;
    }

    public void setLibCategorieIngredient(String libCategorieIngredient) {
        this.libCategorieIngredient = libCategorieIngredient;
    }

    public byte[] getIconeCategorie() {
        return iconeCategorie;
    }

    public void setIconeCategorie(byte[] iconeCategorie) {
        this.iconeCategorie = iconeCategorie;
    }

}