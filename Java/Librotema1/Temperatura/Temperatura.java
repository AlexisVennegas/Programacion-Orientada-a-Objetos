package Temperatura;

public class Temperatura {
	
	private double	celsius,
					farenheit;
	
	public Temperatura(double celsius, double farenheit) {
		this.celsius = celsius;
		this.farenheit = farenheit;
	}
	public double getCelsius() {
		return(this.celsius); 
	}
	public double getFarenheit() {
		return(this.farenheit);
	}
	
	public double celsiusToFarenheit(double celsius) {
		return((1.8 *  celsius) + 32);
	}
	public double farenheitToCelsius(double farenheit) {
		return((farenheit - 32) / 1.8);
	}
}
