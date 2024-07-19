package com.example.recette.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "type_recette")
public class TypeRecette {
    @Id
    @Column(name = "id_type_recette", nullable = false)
    private Integer id;

    @Column(name = "lib_type_recette", nullable = false, length = 50)
    private String libTypeRecette;

    @Column(name = "icone_type_recette", nullable = false)
    private byte[] iconeTypeRecette;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLibTypeRecette() {
        return libTypeRecette;
    }

    public void setLibTypeRecette(String libTypeRecette) {
        this.libTypeRecette = libTypeRecette;
    }

    public byte[] getIconeTypeRecette() {
        return iconeTypeRecette;
    }

    public void setIconeTypeRecette(byte[] iconeTypeRecette) {
        this.iconeTypeRecette = iconeTypeRecette;
    }

}