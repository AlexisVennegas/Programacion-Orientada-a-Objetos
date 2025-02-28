package Calculadora;

public class Calculadora {
	
	
	public static int suma(int num1, int num2) {
		System.out.println(num1 + num2);
		return(num1 + num2);
	}
	
	public int resta(int nume1, int num2) {
		return(nume1 - num2);
	}
	
	public int division(int nume1, int num2) {
		try {
			return(nume1 / num2);				
		}
		catch (Exception e) {
			return(0);
		}
	}
	
	public int multiplicacion(int nume1, int num2) {
		return(nume1 * num2);
	}
}
