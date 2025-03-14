package com.usoLambdas.interfacesFuncionales;

public class Casa {

	private int id;
	private String nombre;
	private double m2;
	
	public Casa() {
		super();
		this.id = 2;
		this.nombre = "12";
		this.m2 = 12;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getM2() {
		return m2;
	}

	public void setM2(double m2) {
		this.m2 = m2;
	}
	
}
