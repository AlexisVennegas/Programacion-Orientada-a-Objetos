package com.proyectoClase.clasicoBasicoRest.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "DEPARTMENTS")
public class Departamentos {

    @Id
    @Column(name = "DEPARTMENT_ID")
    private Integer id;

    @Column(name = "DEPARTMENT_NAME")
    private String nombre;

    @Column(name = "MANAGER_ID")
    private Integer idJefe;

    @Column(name = "LOCATION_ID")
    private Integer idUbicacion;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getIdJefe() {
        return idJefe;
    }

    public void setIdJefe(Integer idJefe) {
        this.idJefe = idJefe;
    }

    public Integer getIdUbicacion() {
        return idUbicacion;
    }

    public void setIdUbicacion(Integer idUbicacion) {
        this.idUbicacion = idUbicacion;
    }

    @Override
    public String toString() {
        return "Departamentos{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", idJefe=" + idJefe +
                ", idUbicacion=" + idUbicacion +
                '}';
    }
}
