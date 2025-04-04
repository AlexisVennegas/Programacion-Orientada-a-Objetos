package com.example.mvc.demo.example.mvc.entities;


import jakarta.persistence.*;

@Entity
@Table(name = "COUNTRIES")  // Opcional, define el nombre de la tabla en la BD
public class Pais {

    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    @Column(name = "COUNTRY_ID")
    public Integer COUNTRY_ID;

    public String COUNTRY_NAME;

    @Column(name = "REGION_ID")
    public String REGION_ID;

    public Pais(){

    }

    public Integer getCOUNTRY_ID() {
        return COUNTRY_ID;
    }

    public void setCOUNTRY_ID(Integer COUNTRY_ID) {
        this.COUNTRY_ID = COUNTRY_ID;
    }

    public String getCOUNTRY_NAME() {
        return COUNTRY_NAME;
    }

    public void setCOUNTRY_NAME(String COUNTRY_NAME) {
        this.COUNTRY_NAME = COUNTRY_NAME;
    }

    public String getREGION_ID() {
        return REGION_ID;
    }

    public void setREGION_ID(String REGION_ID) {
        this.REGION_ID = REGION_ID;
    }

    @Override
    public String toString() {
        return "Pais{" +
                "COUNTRY_ID=" + COUNTRY_ID +
                ", COUNTRY_NAME='" + COUNTRY_NAME + '\'' +
                ", REGION_ID='" + REGION_ID + '\'' +
                '}';
    }
}
