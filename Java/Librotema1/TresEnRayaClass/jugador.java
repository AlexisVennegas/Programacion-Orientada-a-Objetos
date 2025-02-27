package TresEnRayaClass;

public class jugador {
	
	private String	nombre,
					signo;
	
	
	public jugador(String nombre, String signo) {		
		this.nombre = nombre;
		this.signo = signo;
	}
	
	 public String getSimbolo() {
	        return signo;
	    }

	 public String getNombre() {
	        return nombre;
	    }
	
}
