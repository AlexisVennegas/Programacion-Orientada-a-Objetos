package org.p1_impresora3d.data;

import java.util.Objects;

public class Filamento {

	private static final double COSTES_PRODUCCION = 0.30;
	private String referencia;
	private String color;
	private float peso;
	private float precio; //precio por kilo
	
	
	
	public Filamento(String referencia) {
		super();
		this.referencia = referencia;
	}
	
	public Filamento(String referencia, String color, float peso, float precio) {
		super();
		this.referencia = referencia;
		this.color = color;
		this.peso = peso;
		this.precio = precio;
	}

	public String getReferencia() {
		return referencia;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	

	@Override
	public int hashCode() {
		return Objects.hash(referencia);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Filamento other = (Filamento) obj;
		return Objects.equals(referencia, other.referencia);
	}

	@Override
	public String toString() {
		return "Filamento [referencia=" + referencia + ", color=" + color + ", peso=" + peso + ", precio=" + precio
				+ "]";
	}
	
	public double calcularPrecio(double peso) {
		double precioVenta= peso*this.precio*COSTES_PRODUCCION;
		return precioVenta;
	}
	
}
