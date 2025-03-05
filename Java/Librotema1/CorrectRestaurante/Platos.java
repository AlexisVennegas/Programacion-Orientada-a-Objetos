package CorrectRestaurante;

import java.util.ArrayList;
import java.util.List;

public abstract class Platos {
	
	List<Ingredientes> listaIngredientes;
	double huevos,
		carne;
	int totalPlatos;
	
	public Platos(double huevos, double carne){
		this.huevos = huevos * 12;
		this.carne = carne * 1000;
		this.totalPlatos = 0;
		this.listaIngredientes = new ArrayList<>(); // Inicializa la lista aq
		this.listaIngredientes.add(new Ingredientes("huevos", this.huevos));
		this.listaIngredientes.add(new Ingredientes("carne", this.carne));
	}
	
	
	public List<Ingredientes> getListado() {
		return (this.listaIngredientes);
	}
	
	public int getNumPlatos() {
		int result;
		
		
			
		double	chorizoGmsAux,
		huevosAux;	
		
		
		huevosAux = this.huevos;
		chorizoGmsAux = this.carne;
		result = 0;
		
		while(huevosAux >= 2.0 && chorizoGmsAux >= 200.0) {
			result++;
			huevosAux = huevosAux - 2;
			chorizoGmsAux = chorizoGmsAux - 200.0;
		}
		return(result);
	}
	
	
	public void sirvePlato() {
		this.huevos = this.huevos - 2;
		this.carne = this.carne - 200.0;
		  for (Ingredientes ingrediente : listaIngredientes) {
	            if (ingrediente.getNombre().equals("huevos")) {
	                ingrediente.setCantidad(this.huevos); // Actualiza huevos
	            } else if (ingrediente.getNombre().equals("carne")) {
	                ingrediente.setCantidad(this.carne); // Actualiza carne
	            }
	        }
		totalPlatos++;
	}
	public double getHuevos() {
		return(this.huevos);
	}
	public double getChorizo() {
		
		return(this.carne);
	}
	public int getTotalPlatos() {
		return(this.totalPlatos);
	}
	
}
