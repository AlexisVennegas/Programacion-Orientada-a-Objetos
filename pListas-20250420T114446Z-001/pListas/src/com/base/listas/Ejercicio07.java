package com.base.listas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ejercicio07 {
/**
 * 
 * Ordenar listas de enteros al derecho y al reves
 * Mostras ambas.
 * 
 */
	public static void main(String[] args) {
		List<Integer> lista=generarLista();

		// Mostrar la lista original
		System.out.println("Lista original:");
		for (Integer num : lista) {
			System.out.println(num);
		}

		// Ordenar la lista al derecho
		Collections.sort(lista);
		System.out.println("Lista ordenada al derecho:");
		for (Integer num : lista) {
			System.out.println(num);
		}
		// Ordenar la lista al reves
		Collections.sort(lista, Collections.reverseOrder());
		System.out.println("Lista ordenada al reves:");

		for (Integer num : lista) {
			System.out.println(num);
		}

		

	}
	
	public static List<Integer> generarLista(){
		List<Integer> numeros = new ArrayList<Integer>();
		numeros.add(26);
		numeros.add(23);
		numeros.add(35);
		numeros.add(4);
		numeros.add(54);
		return numeros;
	}
}
