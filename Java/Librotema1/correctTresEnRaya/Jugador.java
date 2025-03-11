package correctTresEnRaya;

public class Jugador  {
	
	private String	nombre,
					signo;
	
	public Jugador(String nombre, String signo){
		this.nombre = nombre;
		this.signo = signo;
	}
	
	public String getNombreJugador() {
		return(this.nombre);
	}
	public String getSigno() {
		return(this.signo);
	}
	 
	
}
