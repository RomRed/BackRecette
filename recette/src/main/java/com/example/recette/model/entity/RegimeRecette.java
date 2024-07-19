package com.example.recette.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "regime_recette")
public class RegimeRecette {
    @Id
    @Column(name = "id_regime_recette", nullable = false)
    private Integer id;

    @Column(name = "lib_regime_recette", nullable = false, length = 50)
    private String libRegimeRecette;

    @Column(name = "icone_regime_recette")
    private byte[] iconeRegimeRecette;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLibRegimeRecette() {
        return libRegimeRecette;
    }

    public void setLibRegimeRecette(String libRegimeRecette) {
        this.libRegimeRecette = libRegimeRecette;
    }

    public byte[] getIconeRegimeRecette() {
        return iconeRegimeRecette;
    }

    public void setIconeRegimeRecette(byte[] iconeRegimeRecette) {
        this.iconeRegimeRecette = iconeRegimeRecette;
    }

}