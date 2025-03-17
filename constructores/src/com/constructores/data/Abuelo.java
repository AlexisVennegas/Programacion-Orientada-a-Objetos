package com.constructores.data;

public class Abuelo extends Object {

	String mensaje;
	int numero;
	
	private Abuelo() {
		super();
		System.out.println("Abuelo constructor por defecto");
		
	}
	
	
	public Abuelo(String mensaje, int numero) {
		this();
		this.mensaje = mensaje;
		this.numero = numero;
	}
	 // Constructor con dos parámetros
    public Abuelo(String mensaje, int numBaños, String hola) {
        this(mensaje, 12);  
      
    }
	
}
