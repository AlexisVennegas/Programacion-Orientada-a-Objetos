package com.gesres.bussiness.interfaces;

import java.util.Map;

import com.gesres.data.Ingrediente;

public interface GestionExistencias {
	
	public Map<String,Ingrediente> listExistencias();
	
	public boolean addIngrediente(Ingrediente ingrediente);	
	public boolean addIngrediente(String nombre,int cantidad);	
	public boolean removeIngrediente(Ingrediente ingrediente);		
	public boolean removeIngrediente(String nombre, int cantidad);	
	public Ingrediente getExistencia(Ingrediente ingrediente);
	public Ingrediente getExistencia(String nombre);
	public int getCantidadExistencia(Ingrediente ingrediente);
	public int getCantidadExistencia(String nombre);

}
