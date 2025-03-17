package com.bloqueInstancia.data;

public class Casa {
	
	{
		System.out.println("Mi primer bloque de instancia");
	}
	
	
	
	private int m2;

	public Casa() {
		
	}
	{
		System.out.println("Mi segundo bloque de instancia " + m2);
	}
	

	public int getM2() {
		return m2;
	}

	public void setM2(int m2) {
		this.m2 = m2;
	}
	
	{
		System.out.println("Mi tercer bloque de instancia" + Casa.this.m2);
	}
		
	
	
}
