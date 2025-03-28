package com.jpaOracleClase.data;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "DEPARTMENTS")
public class Departamento {
	@Id
	@Column(name="DEPARTMENT_ID")
	private int id;
	@Column(name="DEPARTMENT_NAME")
	private String nombre;
	@Column(name="MANAGER_ID")
	private Integer idGerente;
	@Column(name="LOCATION_ID")
	private Integer idDireccion;
	
	public Departamento() {
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
	public Integer getIdGerente() {
		return idGerente;
	}
	public void setIdGerente(Integer idGerente) {
		this.idGerente = idGerente;
	}
	public Integer getIdDireccion() {
		return idDireccion;
	}
	public void setIdDireccion(Integer idDireccion) {
		this.idDireccion = idDireccion;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Departamento other = (Departamento) obj;
		if (id != other.id)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Departamento [id=" + id + ", nombre=" + nombre + ", idGerente=" + idGerente + ", idDireccion="
				+ idDireccion + "]";
	}
	
	
	
	

}
