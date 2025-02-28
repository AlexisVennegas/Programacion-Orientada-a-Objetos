package Calculadora;
public class testCalculadora {
	

	
		
		public static void main(String[] args) {
			//Inicializamos dos variables de tipo entero
			int numero1 =  1234;
			int numero2 = 2;
			
			Calculadora calculadora = new Calculadora();
			
			//Invocamos a los m�todos est�ticos de la calculadora
			System.out.println(calculadora.suma(numero1, numero2));
			System.out.println();
			calculadora.resta(numero1, numero2);
			calculadora.multiplicacion(numero1, numero2);
			calculadora.division(numero1, numero2);
			
			//Invocar al m�todo no est�tico para que realice la suma de lo  n�meros
	

	}
}
