package com.ejercicios.Restaurante;


/* 
 * Ejercicio 2.6: Restaurante (*)
 * 		
 */
public class Restaurante {
	public int docenasHuevo,
		huevos,
		kilosChorizo,
		platos;
	double chorizoGms;
	
	 Restaurante(int docenasDeHuevos, int kgDeChorizo) {
	    this.huevos = docenasDeHuevos * 12;  
	    this.kilosChorizo = kgDeChorizo;  
	    this.chorizoGms = (kgDeChorizo * 1000);
	}


	
	public void imprimir(Object object) {
		System.out.print(object);
		System.out.print("\n");
	}
	public void addHuevos(int numero) {
		docenasHuevo += numero; 
		huevos = docenasHuevo * 12; 
		imprimir("Añadiste: "  + docenasHuevo + " docenas de huevos ");
	}
	public void addChorizo(int numero) {
	
		kilosChorizo = kilosChorizo + numero;
		chorizoGms = (kilosChorizo * 1000);
		imprimir("Añadiste " + kilosChorizo + " kilos de kilos de chorizo");
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
