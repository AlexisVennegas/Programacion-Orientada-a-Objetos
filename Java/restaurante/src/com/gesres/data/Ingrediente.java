package com.gesres.data;

public abstract class Ingrediente {
	
	protected String nombre;
	protected int cantidad;
	protected int unidadConversion;	
	
	
	
	public Ingrediente(String nombre,int unidadConversion) {
		super();
		this.nombre = nombre;
		this.unidadConversion = unidadConversion;
	}

	public Ingrediente(String nombre, int cantidad, int unidadConversion) {
		super();
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.unidadConversion = unidadConversion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public int getUnidadConversion() {
		return unidadConversion;
	}

	public void setUnidadConversion(int unidadConversion) {
		this.unidadConversion = unidadConversion;
	}
	
	
	

}
