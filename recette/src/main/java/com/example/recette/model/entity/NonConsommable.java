package com.example.recette.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "non_consommable")
public class NonConsommable {
    @Id
    @Column(name = "id_non_consommable", nullable = false)
    private Integer id;

    @Column(name = "lib_non_consommable", nullable = false, length = 100)
    private String libNonConsommable;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLibNonConsommable() {
        return libNonConsommable;
    }

    public void setLibNonConsommable(String libNonConsommable) {
        this.libNonConsommable = libNonConsommable;
    }

}