package Temperatura;

public class pruebaTemperatura {
	public static void main(String[] args) {
		Temperatura temp = new Temperatura(17, 200);
		
		System.out.println(temp.celsiusToFarenheit(17));
		System.err.println(temp.farenheitToCelsius(62.6));
	}
}
