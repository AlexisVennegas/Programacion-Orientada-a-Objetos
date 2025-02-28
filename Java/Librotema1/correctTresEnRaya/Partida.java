package correctTresEnRaya;

import java.util.Scanner;

public class Partida {
	Tablero tablero;
	Jugador jugador1;
	Jugador maquina;
	boolean ganador,
			jugadaValida;
	String	eleccionMaquina,
			eleccionJugador;
	Scanner scannerJugador;
	
	public Partida(String nombreJugador) {
		this.tablero = new Tablero();
		this.ganador = true;
		this.jugadaValida = false;
		this.eleccionMaquina = "";
		this.eleccionJugador = "";
		this.jugador1 = new Jugador(nombreJugador);
		this.maquina = new Jugador("Marvin");	
		this.scannerJugador = new Scanner(System.in);
		jugar();
	}
	public void imp(Object object) {
		System.out.print(object);
	}
	
	
	public boolean esEmpate() {
	    for (int i = 0; i < 3; i++) {
	        for (int j = 0; j < 3; j++) {
	            // Comprobamos si la casilla contiene un número (del 1 al 9)
	            if (tablero.matriz[i][j].trim().matches("[1-9]")) {
	                return false; // Hay una casilla vacía representada por un número
	            }
	        }
	    }
	    return true; // Si no hay números, es empate
	}


	public  void jugar() {
		while(ganador) {
			tablero.imprimirTablero();
			
		
    		imp("Elige casilla: (1-9)\n");
    		imp("X: Jugador " + jugador1.getNombreJugador() + " ||  O: Máquina " + maquina.getNombreJugador() + "\n");
    		eleccionJugador = scannerJugador.next();
    		

    		if(tablero.comprobarExistente(eleccionJugador)) imp("casilla ocupada, Elige otra\n");
    		else {
    			
    			jugadaValida = tablero.cambiarPieza(eleccionJugador, true);     			
    			eleccionMaquina = eleccionMaquina(eleccionJugador);
    			imp("casilla seleccionada: " + eleccionJugador + "\n");
    			imp("Casilla maquina : " + eleccionMaquina + "\n");
    			
    			if(esEmpate()) {
        			ganador =false;
        			imp("tremendo empate!!");
        			return;
    			}
        		
    			if(comprobarGanador("X")) {
        			tablero.imprimirTablero();
        			ganador = false;
        			imp("juego finalizado" + " Ganador: " + jugador1.getNombreJugador());
        		}
    			else if(comprobarGanador("O")) {
        			tablero.imprimirTablero();
        			ganador = false;
        			imp("juego finalizado" + " Ganador: " + maquina.getNombreJugador());
        		}
    		}
    	
    		
		}
		scannerJugador.close();
	}
	
    
	 public String eleccionMaquina(String casillaJugador) {
	        String eleccionMaquina;
	        do {
	            eleccionMaquina = String.valueOf((int) (Math.random() * 9 + 1));
	        } while (tablero.comprobarExistente(eleccionMaquina)); // Asegurar que la casilla está libre

	        tablero.cambiarPieza(eleccionMaquina, false);
	        return eleccionMaquina;
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
}
