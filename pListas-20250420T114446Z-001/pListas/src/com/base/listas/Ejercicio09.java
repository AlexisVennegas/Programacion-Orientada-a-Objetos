package com.base.listas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Ejercicio09 {
/**
 * 
 * Comprobar que la lista contiene el objeto Casa,
 * modificar el objeto Casa para que funcione el metodo contains
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


		// comprobar si existe el objeto Casa
		boolean existe = lista.contains(casa);
		if (existe) {
			System.out.println("El objeto Casa existe en la lista.");
		} else {
			System.out.println("El objeto Casa no existe en la lista.");
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
			   public boolean equals(Object obj) {
		   if (this == obj) return true;
		   if (obj == null || getClass() != obj.getClass()) return false;
		   Casa casa = (Casa) obj;
		   return tamanio == casa.tamanio && direccion.equals(casa.direccion);
	   }

	
	}
}
