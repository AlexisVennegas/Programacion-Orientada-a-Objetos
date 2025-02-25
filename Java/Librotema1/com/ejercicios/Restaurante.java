package com.ejercicios;


/* 
 * Ejercicio 2.6: Restaurante (*)
 * 		
 */
public class Restaurante {
	int docenasHuevo,
		huevos,
		kilosChorizo,
		platos;
	
	double chorizoGms;
	
	public void Imprimir(Object object) {
		System.out.print(object);
		System.out.print("\n");
	}
	public void addHuevos(int numero) {
		docenasHuevo = huevos +  numero;
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
