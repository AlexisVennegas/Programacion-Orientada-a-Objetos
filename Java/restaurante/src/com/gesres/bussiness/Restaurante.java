package com.gesres.bussiness;

import java.util.HashMap;
import java.util.Map;

import com.gesres.bussiness.interfaces.GestionExistencias;
import com.gesres.bussiness.interfaces.GestionPlatos;
import com.gesres.data.Ingrediente;
import com.gesres.data.Plato;



public class Restaurante implements GestionExistencias, GestionPlatos{
	
	private static Map<String,Ingrediente> existencias = new HashMap<String,Ingrediente>();

	
	
	
	@Override
	public Map listExistencias() {
	
		return existencias;
	}

	@Override
	public boolean addIngrediente(Ingrediente ingrediente) {
		Ingrediente ingredienteExistencias=existencias.get(ingrediente.getNombre());
		if(ingredienteExistencias!=null) return false;
		existencias.put(ingrediente.getNombre(), ingrediente);
		return true;
			
		
	}
	@Override
	public boolean addIngrediente(String nombre,int cantidad) {
		Ingrediente ingredienteExistencias=existencias.get(nombre);
		if(ingredienteExistencias==null) return false;
		int cantidadActual = ingredienteExistencias.getCantidad() + cantidad*ingredienteExistencias.getUnidadConversion();
		ingredienteExistencias.setCantidad(cantidadActual);	
		return true;
		
	}

	@Override
	public boolean removeIngrediente(Ingrediente ingrediente) {
		Ingrediente ingredienteExistencias=existencias.get(ingrediente.getNombre());
		if(ingredienteExistencias==null) return false;
		existencias.remove(ingrediente.getNombre());
		return true;
		
	}
	
	@Override
	public boolean removeIngrediente(String nombre, int cantidad) {
		Ingrediente ingredienteExistencias=existencias.get(nombre);
		if(ingredienteExistencias==null) return false;
		int cantidadActual = ingredienteExistencias.getCantidad() - cantidad;
		ingredienteExistencias.setCantidad(cantidad);
		return true;
		
	}
	

	@Override
	public Ingrediente getExistencia(Ingrediente ingrediente) {
		return existencias.get(ingrediente.getNombre());
	}

	@Override
	public Ingrediente getExistencia(String nombre) {
		return existencias.get(nombre);
	}

	@Override
	public int getCantidadExistencia(Ingrediente ingrediente) {
		return existencias.get(ingrediente.getNombre()).getCantidad();
	}

	@Override
	public int getCantidadExistencia(String nombre) {
		return existencias.get(nombre).getCantidad();
	}
	
	
	@Override
	public void servirPlato(Plato plato) {
		for(Ingrediente ingrediente:plato.getIngredientes()) {
			removeIngrediente(ingrediente.getNombre(),ingrediente.getCantidad());
		}		
	}

	@Override
	public int getNumeroPlatos(Plato plato) {
		int numeroPlatos=0;
		for(Ingrediente ingrediente:plato.getIngredientes()) {
			int numeroPlatosAux=existencias.get(ingrediente.getNombre()).getCantidad()/ingrediente.getCantidad();
			if(numeroPlatos==0) numeroPlatos=numeroPlatosAux;
			if(numeroPlatosAux < numeroPlatos) numeroPlatos=numeroPlatosAux;
		}
		return numeroPlatos;
		
	}


}
