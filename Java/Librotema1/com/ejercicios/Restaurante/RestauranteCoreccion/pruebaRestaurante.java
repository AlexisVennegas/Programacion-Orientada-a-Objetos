package com.ejercicios.Restaurante.RestauranteCoreccion;

public class pruebaRestaurante {

	public static void main(String[] args) {
		Restaurante restaurante = new Restaurante(3, 1.5); // 3 docenas de huevos, 1.5 kg de chorizo

        System.out.println("numeros platos disponibles: " + restaurante.getNumPlatos());
       

        restaurante.sirvePlato();
        System.out.println("Platos restantes: " + restaurante.getNumPlatos());

        
        System.out.println("Platos disponibles después de agregar ingredientes: " + restaurante.getNumPlatos());
  

	}

}
