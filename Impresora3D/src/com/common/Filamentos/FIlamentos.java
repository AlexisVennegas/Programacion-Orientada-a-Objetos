package com.common.Filamentos;

import java.util.Objects;

public class FIlamentos {

	private String referencia;
	private String color;
	private double pesoKg;
	private double precioKg;
	
	
	
	public FIlamentos(String referencia, String color, double pesoKg, double precioKg) {
		super();
		this.referencia = referencia;
		this.color = color;
		this.pesoKg = pesoKg;
		this.precioKg = precioKg;
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



	public double getPesoKg() {
		return pesoKg;
	}



	public void setPesoKg(double pesoKg) {
		this.pesoKg = pesoKg;
	}



	public double getPrecioKg() {
		return precioKg;
	}



	public void setPrecioKg(double precioKg) {
		this.precioKg = precioKg;
	}



	@Override
	public int hashCode() {
		return Objects.hash(color, pesoKg, precioKg, referencia);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FIlamentos other = (FIlamentos) obj;
		return Objects.equals(color, other.color)
				&& Double.doubleToLongBits(pesoKg) == Double.doubleToLongBits(other.pesoKg)
				&& Double.doubleToLongBits(precioKg) == Double.doubleToLongBits(other.precioKg)
				&& Objects.equals(referencia, other.referencia);
	}



	@Override
	public String toString() {
		return "FIlamentos [referencia=" + referencia + ", color=" + color + ", pesoKg=" + pesoKg + ", precioKg="
				+ precioKg + "]";
	}
	
	
	
}
