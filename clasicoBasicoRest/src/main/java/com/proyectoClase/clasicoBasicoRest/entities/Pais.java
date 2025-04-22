package com.proyectoClase.clasicoBasicoRest.entities;


import jakarta.persistence.*;

@Entity
@Table(name = "COUNTRIES")  // Opcional, define el nombre de la tabla en la BD
public class Pais {

    @Id
    //@GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    @Column(name = "COUNTRY_ID")
    private String COUNTRY_ID;

    @Column(name = "COUNTRY_NAME")
    private String COUNTRY_NAME;

    @ManyToOne
    @JoinColumn(name = "REGION_ID")
    private Region region;

    public Pais(){

    }

    public String getCOUNTRY_ID() {
        return COUNTRY_ID;
    }

    public void setCOUNTRY_ID(String COUNTRY_ID) {
        this.COUNTRY_ID = COUNTRY_ID;
    }

    public String getCOUNTRY_NAME() {
        return COUNTRY_NAME;
    }

    public void setCOUNTRY_NAME(String COUNTRY_NAME) {
        this.COUNTRY_NAME = COUNTRY_NAME;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    @Override
    public String toString() {
        return "Pais{" +
                "COUNTRY_ID='" + COUNTRY_ID + '\'' +
                ", COUNTRY_NAME='" + COUNTRY_NAME + '\'' +
                ", region=" + region +
                '}';
    }
}
