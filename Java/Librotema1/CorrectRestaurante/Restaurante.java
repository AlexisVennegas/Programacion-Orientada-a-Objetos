package CorrectRestaurante;

// import java.util.ArrayList;
import java.util.List;

public class Restaurante extends Platos{
	Platos platos;
	int totalPlatos;
	
	
	Restaurante(double huevos, double carne){
		super(huevos, carne);
	}
//	
//	Restaurante(double huevos, double carne){
//		this.platos = new Platos(huevos, carne);
//		this.totalPlatos = 0;
//	}
	
	 public int totalPlatos() {
	        return getTotalPlatos(); 
	    }
	
	 public void servirPlato() {
	        sirvePlato(); 
	    }

	 public List<Ingredientes> mostrarLista() {
	        return getListado();
	    }
	
	 public int getNumPlatos() {
	        return super.getNumPlatos();
	  }
//	Restaurante(int huevos, int kilos){
//		// listaIngredientes.add(new Ingredientes("huevos", 3));
//		// listaIngredientes.add(new Ingredientes("chorizo", 200));
//		this.huevos = huevos;
//		this.kilos = kilos;
//	}
	
	
	
   // listaIngredientes.add(new Ingredientes("Chorizo", 1.5));
	//	Platos platos = new Platos(listaIngredientes);
	
}
