package com.bloqueInstancia.data;

public class Example {
	public class Ejemplo {
	    public Ejemplo() {
	        System.out.println("Constructor de Ejemplo");
	    }

	    public void metodoInstancia() {
	        System.out.println("M�todo de instancia");
	    }

	    public static void metodoEstatico() {
	        // No se puede usar this() o super() aqu�
	        System.out.println("M�todo est�tico");
	    }
	}

	
}
