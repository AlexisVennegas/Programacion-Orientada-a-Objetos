package com.common.Filamentos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class App {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException, ClassNotFoundException {
//		System.out.println("hola");
//
//		
//		File f = null;
//		
//		String[] fichero = {"Data.txt"};
//		
//		for(String nombre_fich:fichero)
//		{
//		// Crea el flujo
//		f= new File(nombre_fich);
//		// Si el fichero no existe, lo creamos
//		if (!f.exists())
//		f.createNewFile();
//		// Comprueba si el fichero tiene permisos de escritura
//		boolean w = f.canWrite();
//		// Recupera la ruta absoluta
//		String r = f.getAbsolutePath();
//		// Muestra los datos recuperados
//		System.out.print("Ruta: " + r + ". Permiso escritura: " + w);
//		System.out.println();
//		}
		 File f;
		 FileOutputStream fo;
		 ObjectOutputStream oos;
		 FileInputStream fi = null;
		 ObjectInputStream ois = null;
			fo = new FileOutputStream("data.txt");
			oos = new ObjectOutputStream(fo);
		oos.writeObject("ahora vamos a escribir esto tendriamos qu recuperar lo anterior mas esto");
		
		f = new File("data.txt");
		
		try {
			fi = new FileInputStream(f);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			try {
				ois = new ObjectInputStream(fi);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//persona p = null;
		
			System.out.println(ois.readObject());
			
		
	

	}


}
