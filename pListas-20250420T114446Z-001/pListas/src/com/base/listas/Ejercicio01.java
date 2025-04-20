package src.com.base.listas;


import java.util.ArrayList;
import java.util.List;

public class Ejercicio01 {
/**
 * 
 * Crear una lista de enteros y agregar 5 elementos.
 * Mostrarlos con un syso
 */
	public static void main(String[] args) {
		
	// Declarar la lista
		List<Integer> listaEnteros = new ArrayList<>();

	// Agregar elementos a la lista
		listaEnteros.add(1);
		listaEnteros.add(2);
		listaEnteros.add(3);
		listaEnteros.add(4);
		listaEnteros.add(5);

	// Mostrar los elementos de la lista
		System.out.println("Elementos de la lista:");
		for (Integer numero : listaEnteros) {
			System.out.println(numero);
		}
	}

}
