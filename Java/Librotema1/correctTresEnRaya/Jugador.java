package correctTresEnRaya;

public class Jugador  {
	private String	nombre,
					signo;
	private Tablero tablero;
	
	Jugador(String nombre, Tablero tablero){
		this.nombre = nombre;
		this.signo = "X";
		this.tablero = tablero;
	}
	public String GetNombreJugador() {
		return(this.nombre);
	}
	
	  public String eleccionMaquina(String casillaJugador) {
	        String eleccionMaquina;
	        do {
	            eleccionMaquina = String.valueOf((int) (Math.random() * 9 + 1));
	        } while (tablero.comprobarExistente(eleccionMaquina)); // Asegurar que la casilla está libre

	        tablero.cambiarPieza(eleccionMaquina, false);
	        return eleccionMaquina;
	    }
	
}
