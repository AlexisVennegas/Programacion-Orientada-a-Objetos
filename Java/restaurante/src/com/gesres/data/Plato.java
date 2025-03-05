package com.gesres.data;

import java.util.Set;

public abstract class Plato implements java.io.Serializable{
	
	protected String nombre;
	
	protected Set<Ingrediente> ingredientes;

	public Plato(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Set<Ingrediente> getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(Set<Ingrediente> ingredientes) {
		this.ingredientes = ingredientes;
	}
	
	
	

}
