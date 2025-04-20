package com.base.listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio04 {
/**
 * 
 * Eliminar un elemento por valor
 * Eliminar un elemento por indice
 * 
 * Mostrarlos con un syso la lista final
 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List<Integer> lista=generarLista();
		System.out.println("Introducir un entero:");
		int indice;//recoger un entero;
		//Eliminaci�n por indice. El tipo es int
		
		Integer numero; //cambiarlo a integer;
		//Eliminaci�n por numero. El tipo es Integer

		// primero preguntar si quiere eliminar por indice o por valor
		System.out.println("Eliminar por indice o por valor? (i/v):");
		String opcion = sc.nextLine();

		if (opcion.equals("i")) {
			System.out.println("Introducir el indice:");
			indice = sc.nextInt(); //recoger un entero;
			if (indice >= 0 && indice < lista.size()) {
				lista.remove(indice);
				System.out.println("Elemento eliminado por indice: " + indice);
			} else {
				System.out.println("Indice no valido.");
			}
		} else if (opcion.equals("v")) {
			System.out.println("Introducir el numero:");
			numero = sc.nextInt(); //recoger un entero;
			if (lista.remove(Integer.valueOf(numero))) {
				System.out.println("Elemento eliminado por valor: " + numero);
			} else {
				System.out.println("Elemento no encontrado.");
			}
		} else {
			System.out.println("Opcion no valida.");
		}

	// Mostrar la lista final
		System.out.println("Lista final:");
		for (Integer num : lista) {
			System.out.println(num);
		}
		sc.close();

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
