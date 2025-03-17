package com.enumerados;

public class App {

	public static void main(String[] args) {
		
		Color miColor = Color.AZUL;
		
		System.out.println(Color.AZUL);
		System.out.println(miColor.getClass().getSimpleName());
		System.out.println(miColor.getDeclaringClass().getSimpleName()); // Salida: Dia
		System.out.println(miColor instanceof Enum); // Salida: true
		System.out.println(miColor.getCodigo());


	}

}
