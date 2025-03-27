package com.jpaOracleClase.data;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Departamento {

	@Id
	private int id;
	private String nombre;
	private Integer idGerente, idDireccion;
	
//	public Departamento(int id, String nombre, Integer idGerente, Integer idDireccion) {
//		super();
//		this.id = id;
//		this.nombre = nombre;
//		this.idGerente = idGerente;
//		this.idDireccion = idDireccion;
//	}
	
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
		return Objects.hash(id, nombre);
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
		return id == other.id && Objects.equals(nombre, other.nombre);
	}


	@Override
	public String toString() {
		return "Departamento [id=" + id + ", nombre=" + nombre + ", idGerente=" + idGerente + ", idDireccion="
				+ idDireccion + "]";
	}
	
	
	
}
