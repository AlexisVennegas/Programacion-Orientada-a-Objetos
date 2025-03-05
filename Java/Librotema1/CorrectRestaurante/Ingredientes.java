package CorrectRestaurante;

import java.util.ArrayList;
import java.util.List;

public   class  Ingredientes {
	
	private String nombre;
	private double cantidad;
	
	
	public Ingredientes(String nombre, double cantidad){
		this.nombre = nombre;
		this.cantidad = cantidad;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	public String getNombre() {
		return this.nombre;
	}
	public double getCantidad() {
		return(this.cantidad);
	}
	
}
