package com.example.mvc.demo.example.mvc.entities;


import jakarta.persistence.*;


@Entity
@Table(name = "REGIONS")  // Opcional, define el nombre de la tabla en la BD
public class Region {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Generación automática del ID
    @Column(name = "REGION_ID") // Opcional, define el nombre de la columna en la BD
    public Integer REGION_ID;


    public String REGION_NAME;

    public Region() {

    }

    public Integer getREGION_ID() {
        return REGION_ID;
    }

    public void setREGION_ID(Integer REGION_ID) {
        this.REGION_ID = REGION_ID;
    }

    public String getREGION_NAME() {
        return REGION_NAME;
    }

    public void setREGION_NAME(String REGION_NAME) {
        this.REGION_NAME = REGION_NAME;
    }

    @Override
    public String toString() {
        return "Region{" +
                "REGION_ID=" + REGION_ID +
                ", REGION_NAME='" + REGION_NAME + '\'' +
                '}';
    }
}
