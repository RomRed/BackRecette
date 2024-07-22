package com.example.recette.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "type_etape")
public class TypeEtape {
    @Id
    @Column(name = "id_type_etape", nullable = false)
    private Integer id;

    @Column(name = "lib_type_etape", nullable = false, length = 2000)
    private String libTypeEtape;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLibTypeEtape() {
        return libTypeEtape;
    }

    public void setLibTypeEtape(String libTypeEtape) {
        this.libTypeEtape = libTypeEtape;
    }

}