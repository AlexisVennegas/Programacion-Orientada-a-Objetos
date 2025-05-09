package com.proyectoClase.clasicoBasicoRest.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "LOCATIONS")
public class Direccion {


    public Direccion() {
    }
    @Id
    @Column(name = "LOCATION_ID")
    private Integer id;

    @Column(name = "STREET_ADDRESS")
    private String direccionA;

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

    public String getDireccionA() {
        return this.direccionA;
    }

    public void setDireccion(String direccionA) {
        this.direccionA = direccionA;
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
                ", direccion='" + direccionA + '\'' +
                ", codigoPostal='" + codigoPostal + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", provincia='" + provincia + '\'' +
                ", paisId='" + paisId + '\'' +
                '}';
    }
}
