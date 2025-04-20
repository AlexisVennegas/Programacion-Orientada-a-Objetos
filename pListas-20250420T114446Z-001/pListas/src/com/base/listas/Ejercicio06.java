package com.base.listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio06 {
/**
 * 
 * Vaciar una lista
 * Comprobar si una lista esta vacia
 * 
 * Mostrarlos con un syso la lista final
 */
	public static void main(String[] args) {
		List<Integer> lista=generarLista();

		// Mostrar la lista original
		System.out.println("Lista original:");
		for (Integer num : lista) {
			System.out.println(num);
		}
		// Vaciar la lista
		lista.clear();
		System.out.println("Lista vaciada.");

		// Comprobar si la lista esta vacia
		if (lista.isEmpty()) {
			System.out.println("La lista esta vacia.");
		} else {
			System.out.println("La lista no esta vacia.");
		}
		// Mostrar la lista final
		System.out.println("Lista final:");
		for (Integer num : lista) {
			System.out.println(num);
		}
		
		

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
