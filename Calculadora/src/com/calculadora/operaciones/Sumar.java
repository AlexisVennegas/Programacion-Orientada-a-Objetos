package com.calculadora.operaciones;

public class Sumar implements IOperar {
	
	
	@Override
	public double operar(double operador1, double operador2) {
		return(operador1+operador2);
	}
	
	
}
