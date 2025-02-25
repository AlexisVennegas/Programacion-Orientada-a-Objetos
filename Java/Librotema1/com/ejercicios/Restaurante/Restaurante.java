package com.ejercicios.Restaurante;


/* 
 * Ejercicio 2.6: Restaurante (*)
 * 		
 */
public class Restaurante {
	int docenasHuevo,
		huevos,
		kilosChorizo,
		platos;
	
	// Restaurante(int docenasDeHuevos, double kgDeChorizo) {
	 //   huevos = docenasDeHuevos * 12;  // Conversión de docenas a huevos
	  //  chorizo = (int) (kgDeChorizo * 1000);  // Conversión de kilos a gramos
//	}

	double chorizoGms;
	
	public void Imprimir(Object object) {
		System.out.print(object);
		System.out.print("\n");
	}
	public void addHuevos(int numero) {
		docenasHuevo += numero; 
		huevos = docenasHuevo * 12; 
		Imprimir("Añadiste: "  + docenasHuevo + " docenas de huevos ");
	}
	public void addChorizo(int numero) {
	
		kilosChorizo = kilosChorizo + numero;
		chorizoGms = (kilosChorizo * 1000);
		Imprimir("Añadiste " + kilosChorizo + " kilos de kilos de chorizo");
	}
	public int getNumPlatos() {
		int result,
			huevosAux;
			
		double chorizoGmsAux;
		
		
		huevosAux = huevos;
		chorizoGmsAux = chorizoGms;
		result = 0;
		
		while(huevosAux >= 2 && chorizoGmsAux >= 200.0) {
			result++;
			huevosAux = huevosAux - 2;
			chorizoGmsAux = chorizoGmsAux - 200.0;
		}
		return(result);
	}
	public void sirvePlato() {
		huevos = huevos - 2;
		chorizoGms = chorizoGms - 200;
		platos++;
	}
	public int getHuevos() {
		return(huevos);
	}
	public double getChorizo() {
		
		return(chorizoGms);
	}
	
	
}
