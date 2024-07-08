package com.example.recette.entity;

import javax.persistence.*;

@Entity
@Table(name = "pays")
public class Pay {
    @Id
    @Column(name = "id_pays", nullable = false)
    private Integer id;

    @Column(name = "lib_pays", nullable = false, length = 100)
    private String libPays;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_continent", nullable = false)
    private Continent idContinent;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLibPays() {
        return libPays;
    }

    public void setLibPays(String libPays) {
        this.libPays = libPays;
    }

    public Continent getIdContinent() {
        return idContinent;
    }

    public void setIdContinent(Continent idContinent) {
        this.idContinent = idContinent;
    }

}