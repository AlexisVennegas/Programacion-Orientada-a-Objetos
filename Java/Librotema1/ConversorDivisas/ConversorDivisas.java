package ConversorDivisas;

public class ConversorDivisas {
	private double tipoDeCambio;
	
	public ConversorDivisas() {
		tipoDeCambio = 0.85;
	}
	
	public ConversorDivisas(double tc) {
		this.tipoDeCambio = tc;
	}
	
	
	// metodos para la conversion
	public double librasToEuros(double libras) {
		return(libras * this.tipoDeCambio);
	}
	public double eurosToLibras(double euros) {
		return(euros * this.tipoDeCambio);
	}
	//get y set para cambiar el tipo de cambio
	public void setTipoCambio(double tc) {
		this.tipoDeCambio = tc;
	}
	public double getTipoCambio() {
		return(this.tipoDeCambio);
	}
}
