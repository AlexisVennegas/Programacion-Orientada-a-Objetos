package com.calculadora;

import com.calculadora.operaciones.IOperar;
import com.calculadora.operaciones.Restar;
import com.calculadora.operaciones.Sumar;

public class Calculadora {

	public static void main(String[] args) {
		int x = 5;
		
		System.out.println(x++ + ++x);
	}
	
	
			IOperar dividir = new IOperar() {
			public double operar(double operando1, double operando2) {
				
				double resultado = 0;
				try {
					resultado = operando1/operando2;
				}catch(ArithmeticException  e) {
					System.out.println("error");
				}
				return(resultado);
			}
			
		
		};
		
	
		

}
