package com.bloqueInstancia.data;

public class Example {
	public class Ejemplo {
	    public Ejemplo() {
	        System.out.println("Constructor de Ejemplo");
	    }

	    public void metodoInstancia() {
	        System.out.println("Método de instancia");
	    }

	    public static void metodoEstatico() {
	        // No se puede usar this() o super() aquí
	        System.out.println("Método estático");
	    }
	}

	
}
