package com.proyectoClase.claseBasicoSeguridad.entities;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "REGIONS")
public class Region {

    @Id
    @Column(name="REGION_ID")
    private int id;
    @Column(name="REGION_NAME")
    private String nombre;
	public Region() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		return "Region [id=" + id + ", nombre=" + nombre + "]";
	}
    
    
    
}
