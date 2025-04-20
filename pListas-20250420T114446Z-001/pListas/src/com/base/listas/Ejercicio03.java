package com.base.listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio03 {
/**
 * 
 * Con la lista dada, verificar si un elemento existe
 * 
 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List<Integer> lista=generarLista();

		System.out.println("Introducir un entero:");
		int numero = sc.nextInt(); //recoger un entero;
		//Verificar si existe el elemento
		boolean existe = lista.contains(numero);
		if (existe) {
			System.out.println("El elemento " + numero + " existe en la lista.");
		} else {
			System.out.println("El elemento " + numero + " no existe en la lista.");
		}
		//Verificar si existe el elemento



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
