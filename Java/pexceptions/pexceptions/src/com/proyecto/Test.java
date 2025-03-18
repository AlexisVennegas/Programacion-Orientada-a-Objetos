package com.proyecto;

import java.util.Scanner;

import com.proyecto.common.util.ValidationString;

public class Test {

	public static void main(String[] args) {
		// Declarar las variables necesarias
		Scanner scanner = new Scanner(System.in);
		String input;

		while (true) {
			try {
				// Paso 2. Pedir una cadena por consola al usuario
				System.out.print("Introduce una cadena: ");
				input = scanner.nextLine();

				// Paso 3. Validar si la cadena es correcta con los valores por defecto
				ValidationString.validLenght(input);

				// Paso 3.1. Se muestra un mensaje de cadena válida
				System.out.println("Cadena valida");

			} catch (Exception e) {
				// Paso 4. Mostrar un mensaje adecuado a la excepción recogida
				System.out.println(e.getMessage() + "entre aqui jeje");
			
			
		}
		}
		
	}

}