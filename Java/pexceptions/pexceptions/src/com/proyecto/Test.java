package com.proyecto;

import java.util.Scanner;

public class Test {

	// Todo el c�digo excepto las declaraciones debe estar en un bloque try-catch
	public static void main(String[] args) {
		// Declarar las variables necesarias
		boolean bucleInifito;
		Scanner sc;
		String cadena;

		sc = new Scanner(System.in);
		bucleInifito = true;
		cadena = "";

		try {
			// Paso 1. Realizar un bucle infinito, que �nicamente se pare
			// cuando el c�digo lance una excepcion de cadena nula o vac�a o
			// de palabra no permitida introducida
			while (bucleInifito) {
				// Paso 2. Pedir una cadena por consola al usuario
				cadena = sc.next();
				// Paso 3. Validar si la cadena es correcta con los valores por defecto
				try {
					if ("".equals(cadena)) {
						throw new Exception("cadena vacia");
					}
					// Paso 3.1. Se muestra un mensaje de cadena válida
					System.out.println("Cadena valida");
				} catch (Exception e) {
					System.out.println("Cadena no valida ");
					// Paso 3.1. Se muestra un mensaje de cadena no válida
				}
				System.out.println("Cadena valida");
				// Paso 3.1. Se muestra un mensaje de cadena v�lida
			}
			// Paso 4. Cuando se recojan todas las excepciones (de ambos bloques try/cach)
			// mostrar un mensaje adecuado a la excepci�n recogida

		} catch (Exception e) {
			bucleInifito = false;
		}

		sc.close();
		System.out.println("fin del programa");
	}

}
