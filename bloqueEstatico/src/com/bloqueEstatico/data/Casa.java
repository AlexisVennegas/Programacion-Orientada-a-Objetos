package com.bloqueEstatico.data;

public class Casa {
	public static final String NOMBRE_INMOBILARIA;
	{
		System.out.println("mi pimer bloque de instnacia");
		
	}
	private int m2;
	
	static {
		NOMBRE_INMOBILARIA = "XXXX";
		
	}
	
	public Casa(){
		
	}
	{
		System.out.println("mi segundo bloque de instancia");
		this.m2 = 10;
	}
	public int getM2() {
		return(m2);
	}
}
