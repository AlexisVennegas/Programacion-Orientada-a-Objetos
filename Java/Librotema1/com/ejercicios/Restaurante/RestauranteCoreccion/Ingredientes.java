package com.ejercicios.Restaurante.RestauranteCoreccion;

public class Ingredientes {
	
	public String nombreIngrediente;
	public double cantidad;
	
	Ingredientes(String nmbIngrediente, double cantidad){
		this.nombreIngrediente = nmbIngrediente;
		this.cantidad = cantidad;
	}
	
	
	public void addHuevos(double cantidadAdd) {
		this.cantidad += cantidadAdd;
	}
	public void addChorizos(double cantidadAdd) {
		this.cantidad += cantidadAdd;
	}
	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	
	  
	public double getCantidad() {
	    return this.cantidad;
	}
	
}
