package com.calculadora;

import com.calculadora.operaciones.IOperar;
import com.calculadora.operaciones.Restar;
import com.calculadora.operaciones.Sumar;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IOperar sumar = new Sumar();
		
		double resultado = sumar.operar(2, 3);
		
		IOperar restar = new Restar();
		
		double resultado2 = restar.operar(2, 3);
		
		IOperar sumar2 = (a,b) -> a*b;
		double resultado5 = sumar2.operar(10,10);
		
		System.out.println(resultado5 + "hola soy 5");
		//  clase anonima 
		IOperar multiplicar = new IOperar() {
			public double operar(double operando1, double operando2) {
				return(operando1 * operando2);
			}
		};
		
		double resultado3 = multiplicar.operar(2, 3);
		System.out.println(resultado + resultado2 + resultado3);
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
