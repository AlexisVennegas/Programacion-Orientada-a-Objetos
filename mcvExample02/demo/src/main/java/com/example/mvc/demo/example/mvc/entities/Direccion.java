package com.example.mvc.demo.example.mvc.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "LOCATIONS")
public class Direccion {


    @Id
    @Column(name = "LOCATION_ID")
    private Integer id;

    @Column(name = "STREET_ADDRESS")
    private String STREET_ADDRESS;

    @Column(name = "POSTAL_CODE")
    private String codigoPostal;

    @Column(name = "CITY")
    private String ciudad;

    @Column(name = "STATE_PROVINCE")
    private String provincia;

    @Column(name = "COUNTRY_ID")
    private String paisId;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDireccion() {
        return STREET_ADDRESS;
    }

    public void setDireccion(String direccion) {
        this.STREET_ADDRESS = direccion;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getPaisId() {
        return paisId;
    }

    public void setPaisId(String paisId) {
        this.paisId = paisId;
    }

    @Override
    public String toString() {
        return "Direccion{" +
                "id=" + id +
                ", direccion='" + STREET_ADDRESS + '\'' +
                ", codigoPostal='" + codigoPostal + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", provincia='" + provincia + '\'' +
                ", paisId='" + paisId + '\'' +
                '}';
    }
}
