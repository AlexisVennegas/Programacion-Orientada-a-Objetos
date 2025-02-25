package com.ejercicios.Restaurante;

public class PruebaRestaurante {

	public static void Imp(Object object) {
		System.out.print(object);
		System.out.print("\n");
	}
	public static void main(String[] args) {
	
		Restaurante restaurante = new Restaurante();
		int huevosdocena,
			kilosCarne,
			huevos,
			totalPlatos;
			
		
			huevosdocena = 2;
			kilosCarne = 2;
			huevos = 24;
			totalPlatos = 0;
		double chorizoGms = 2000;
		restaurante.addHuevos(huevosdocena);
		restaurante.addChorizo(kilosCarne);
		while(huevos >= 2 && chorizoGms >= 200) {
		
			Imp("total huevos: " + restaurante.getHuevos());
			Imp("total de chorizo: " + restaurante.getChorizo());
			Imp("total Platos que puedes servir: " + restaurante.getNumPlatos());
			restaurante.sirvePlato();
			huevos = restaurante.getHuevos();
			chorizoGms = restaurante.getChorizo();
			totalPlatos = restaurante.getNumPlatos(); // Aquí ya obtienes el número total de platos

		}
		
		
		
		
		
	}

}
