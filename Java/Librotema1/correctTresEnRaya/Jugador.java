package correctTresEnRaya;

public class Jugador  {
	
	private String	nombre,
					signo;
	
	public Jugador(String nombre){
		this.nombre = nombre;
		this.signo = "X";
	}
	
	public String getNombreJugador() {
		return(this.nombre);
	}
	public String getSigno() {
		return(this.signo);
	}
	 
	
}
