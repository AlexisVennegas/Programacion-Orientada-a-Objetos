package com.proyectoClase.claseBasicoSeguridad.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity

@Table(name = "COUNTRIES")
public class Pais {

    @Id
    @Column(name="COUNTRY_ID")
    private String id;
    @Column(name="COUNTRY_NAME")
    //@NotBlank(groups = ValidarModificar.class, message="{error.pais.nombre.blank}")
    private String nombre;

    @ManyToOne
    @JoinColumn(name = "REGION_ID")
    private Region region;

	public Pais() {
		super();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Region getRegion() {
		return region;
	}

	public void setRegion(Region region) {
		this.region = region;
	}

	@Override
	public String toString() {
		return "Pais [id=" + id + ", nombre=" + nombre + ", region=" + region + "]";
	}
    
    
    
}
