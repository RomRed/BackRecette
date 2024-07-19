package com.example.recette.model.entity;

import javax.persistence.*;
import java.time.OffsetTime;

@Entity
@Table(name = "etape")
public class Etape {
    @Id
    @Column(name = "id_etape", nullable = false)
    private Integer id;

    @Column(name = "duree_etape", nullable = false)
    private OffsetTime dureeEtape;

    @Column(name = "instructions_etape", nullable = false, length = 2000)
    private String instructionsEtape;

    @Column(name = "image_etape")
    private byte[] imageEtape;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_recette", nullable = false)
    private Recette idRecette;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_type_etape")
    private TypeEtape idTypeEtape;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public OffsetTime getDureeEtape() {
        return dureeEtape;
    }

    public void setDureeEtape(OffsetTime dureeEtape) {
        this.dureeEtape = dureeEtape;
    }

    public String getInstructionsEtape() {
        return instructionsEtape;
    }

    public void setInstructionsEtape(String instructionsEtape) {
        this.instructionsEtape = instructionsEtape;
    }

    public byte[] getImageEtape() {
        return imageEtape;
    }

    public void setImageEtape(byte[] imageEtape) {
        this.imageEtape = imageEtape;
    }

    public Recette getIdRecette() {
        return idRecette;
    }

    public void setIdRecette(Recette idRecette) {
        this.idRecette = idRecette;
    }

    public TypeEtape getIdTypeEtape() {
        return idTypeEtape;
    }

    public void setIdTypeEtape(TypeEtape idTypeEtape) {
        this.idTypeEtape = idTypeEtape;
    }

}