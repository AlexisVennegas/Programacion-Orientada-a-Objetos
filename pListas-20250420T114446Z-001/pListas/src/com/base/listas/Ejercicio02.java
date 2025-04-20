package com.base.listas;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio02 {
/**
 * 
 * Con la lista dada, obtener el tama�o de una lista y al primer y �ltimo elemento
 * Mostrarlos con un syso
 */
	public static void main(String[] args) {
		List<Integer> lista=generarLista();

		// Tama�o de la lista
		int tamano = lista.size();
		System.out.println("Tama�o de la lista: " + tamano);

		// Primer elemento
		Integer primerElemento = lista.get(0);
		System.out.println("Primer elemento: " + primerElemento);
		// �ltimo elemento
		Integer ultimoElemento = lista.get(tamano - 1);
		System.out.println("�ltimo elemento: " + ultimoElemento);

	}
	
	public static List<Integer> generarLista(){
		List<Integer> numeros = new ArrayList<Integer>();
		numeros.add(1);
		numeros.add(2);
		numeros.add(3);
		numeros.add(4);
		numeros.add(5);
		return numeros;
	}
}
