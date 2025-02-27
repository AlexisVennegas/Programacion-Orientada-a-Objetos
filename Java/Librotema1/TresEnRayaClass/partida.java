package TresEnRayaClass;

import java.util.Scanner;

public class partida {


	private boolean ganador, 
					jugadaValida;
	private String	eleccionJugador,
					eleccionMaquina;
	private tablero tablero;
	private jugador jugador1;
	
	
	public partida() {
		this.tablero  = new tablero();
		this.jugador1 = new Jugador("Alexis", "X");
	}
	
	public void iniciarJuego() {
		ganador = true;
		jugadaValida = false;
		eleccionMaquina = "";
		Scanner scanner = new Scanner(System.in);
		
		
		
		while(ganador) {
			// aqui imprimo toda la chingadera
			imprimirTablero();
			imp("Elige casilla: (1-9)\n");
			imp("X: Jugador || O: Máquina\n");
			
			eleccionJugador = scanner.next();
			if(comprobarExistente(eleccionJugador)) imp("casilla ocupada, elige otra\n");
			else {
				jugadaValida = cambiarPieza(eleccionJugador, true);
				eleccionMaquina = eleccionMaquina(eleccionJugador);
				imp("casilla seleccionada: " + eleccionJugador + "\n");
    			imp("Casilla maquina : " + eleccionMaquina + "\n");
			}
			if(comprobarGanador("X") || comprobarExistente("O")) 
    		{
    			imprimirTablero();
    			ganador = false;
    			imp("juego finalizado");
    		}
			
		}
		scanner.close();
	}
	
	public void imp(Object object) {
		System.out.print(object);
	
	}
	
	public void imprimirTablero() {
		for(int i = 0; i < 3; i++) {
			
			for(int j = 0; j < 7; j++) {
				imp(tablero.matriz[j][i]);
			}
			imp("\n");
		}
	}
	
	
	
	public  String eleccionMaquina(String casillaJugador) {
    	String eleccionMaquina;
    	
    	eleccionMaquina = "" + Math.round(Math.random() * 9 + 1);
    	// Imp("hola " + eleccionMaquina + " " + casillaJugador);
    	if(comprobarExistente(eleccionMaquina)) { 
    		eleccionMaquina(casillaJugador);
    		
    	}
    	else {
	    	cambiarPieza(eleccionMaquina, false);    		
    	}
    		//Imp("Eleccion maquina: " + eleccionMaquina + "\n");
    
    		
    	//if(comprobarGanador(eleccionMaquina)) return(true);
    	return(eleccionMaquina);
    }
	
	  public  boolean comprobarGanador(String casilla) {
		    
	    	if (tablero.matriz[1][0].trim().equals(casilla) && tablero.matriz[3][0].trim().equals(casilla) && tablero.matriz[5][0].trim().equals(casilla)) return true;
	        if (tablero.matriz[1][1].trim().equals(casilla) && tablero.matriz[3][1].trim().equals(casilla) && tablero.matriz[5][1].trim().equals(casilla)) return true;
	        if (tablero.matriz[1][2].trim().equals(casilla) && tablero.matriz[3][2].trim().equals(casilla) && tablero.matriz[5][2].trim().equals(casilla)) return true;
	       
	        if (tablero.matriz[1][0].trim().equals(casilla) && tablero.matriz[1][1].trim().equals(casilla) && tablero.matriz[1][2].trim().equals(casilla)) return true;
	        if (tablero.matriz[3][0].trim().equals(casilla) && tablero.matriz[3][1].trim().equals(casilla) && tablero.matriz[3][2].trim().equals(casilla)) return true;
	        if (tablero.matriz[5][0].trim().equals(casilla) && tablero.matriz[5][1].trim().equals(casilla) && tablero.matriz[5][2].trim().equals(casilla)) return true;
	
	        if (tablero.matriz[1][0].trim().equals(casilla) && tablero.matriz[3][1].trim().equals(casilla) && tablero.matriz[5][2].trim().equals(casilla)) return true;
	        if (tablero.matriz[5][0].trim().equals(casilla) && tablero.matriz[3][1].trim().equals(casilla) && tablero.matriz[1][2].trim().equals(casilla)) return true;
	    	
	    	return(false);
	    }
	  
	  public  boolean comprobarExistente(String Casilla) {
		  for (int i = 0; i < 7; i++) { 
		        for (int j = 0; j < 3; j++) { 
		            if (Casilla.equals(tablero.matriz[i][j].trim())) { 
		             return(false);
		        }
		       }
		  }
		  return(true);
	}
	  
	    public  boolean cambiarPieza(String casillaJugador, boolean jugador) {
		    for (int i = 0; i < 7; i++) { 
		        for (int j = 0; j < 3; j++) { 
		            if (casillaJugador.equals(tablero.matriz[i][j].trim()) && jugador) { 
		                tablero.matriz[i][j] = " X ";  
		                //Imp("Entré al if\n");
		                return true; 
		            }
		            else if (casillaJugador.equals(tablero.matriz[i][j].trim()) && !(jugador)) { 
		                tablero.matriz[i][j] = " O ";  
		              
		                return true; 
		            } 
		        }
		    }
		    
		
		    Imp("Casilla no encontrada || ocupada\n");  
		    return false;  
		}
		
}
