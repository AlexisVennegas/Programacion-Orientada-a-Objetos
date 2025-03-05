package CorrectRestaurante;

public class pruebaRestaurante {
	public static void main(String[] args) {
		
		int  huevos,
			carne;
		
		huevos = 4;
		carne = 5;
		double huevosAux = huevos * 12;
		double carneAux = carne * 1000;
		Restaurante restaurante = new Restaurante(huevos, carne);
		
		
		
		while(huevosAux >= 2 && carneAux >= 200.0) {
			System.out.println("total platos puedes servir: " + restaurante.getNumPlatos());
			
			restaurante.servirPlato();
			
			
		
			System.out.println("Ingredientes disponibles: ");
		       for (Ingredientes ingrediente : restaurante.mostrarLista()) { 
		            System.out.println(ingrediente.getNombre() + ": " + ingrediente.getCantidad());
		     }
		       huevosAux -= 2;
		       carneAux -= 200.0;
		}
		System.out.println("total platos serviddos " + restaurante.totalPlatos() + "\n");
	}
}
