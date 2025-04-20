package com.base.listas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Ejercicio10 {
/**
 * 
 * Comprobar que la lista el indice que ocupa el objeto Casa dado,
 * comprobar que no funciona si quitamos el metodo equals de Casa
 * 
 */
	public static void main(String[] args) {
		List<Casa> lista=generarLista();
		Casa casa =new Casa(110,"XXXXX");
		

		// mostrar la lista original
		System.out.println("Lista original:");
		for (Casa casa1 : lista) {
			System.out.println("Tamaño: "+casa1.tamanio+" Direccion: "+casa1.direccion);
		}

		// comprobar el indice del objeto Casa
		int indice = lista.indexOf(casa);
		if (indice != -1) {
			System.out.println("El objeto Casa se encuentra en el indice: " + indice);
		} else {
			System.out.println("El objeto Casa no se encuentra en la lista.");
		}
		

	}
	
	public static List<Casa> generarLista(){
		List<Casa> casas = new ArrayList<Casa>();
		casas.add(new Casa(100,"XXXXXX"));
		casas.add(new Casa(110,"XXXXX"));;
		casas.add(new Casa(120,"XXXX"));
		casas.add(new Casa(130,"XXX"));
		casas.add(new Casa(140,"XX"));
		return casas;
	}
	static class Casa{
		
	   int tamanio;
	   String direccion;
	   
	   public Casa(int tamanio, String direccion) {
		   this.tamanio=tamanio;
		   this.direccion=direccion;
	   }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((direccion == null) ? 0 : direccion.hashCode());
		result = prime * result + tamanio;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Casa other = (Casa) obj;
		if (direccion == null) {
			if (other.direccion != null)
				return false;
		} else if (!direccion.equals(other.direccion))
			return false;
		if (tamanio != other.tamanio)
			return false;
		return true;
	}
	   
	   //equals
	   
	
	}
}
