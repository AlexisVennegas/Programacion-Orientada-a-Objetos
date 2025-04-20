package com.base.listas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Ejercicio08 {
/**
 * 
 * Eliminar sin duplicados
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

		// Eliminar duplicados
		Set<Integer> set = new HashSet<>(lista); // Usar un Set para eliminar duplicados
		lista.clear();
		lista.addAll(set);
		System.out.println("Lista sin duplicados:");
		for (Integer num : lista) {
			System.out.println(num);
		}

	}
	
	public static List<Integer> generarLista(){
		List<Integer> numeros = new ArrayList<Integer>();
		numeros.add(26);
		numeros.add(23);
		numeros.add(35);
		numeros.add(23);
		numeros.add(26);
		return numeros;
	}
}
