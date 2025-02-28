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
		this.jugador1 = new Jugador(nombreJugador, this.tablero);
		this.maquina = new Jugador("Marvin", this.tablero);	
		this.scannerJugador = new Scanner(System.in);
		
		while(ganador) {
			tablero.imprimirTablero();
		
    		imp("Elige casilla: (1-9)\n");
    		imp("X: Jugador " + jugador1.GetNombreJugador() + "||  O: Máquina " + maquina.GetNombreJugador() + "\n");
    		eleccionJugador = scannerJugador.next();
    		
    		if(esEmpate()) {
    			ganador =false;
    			imp("tremendo empate!!");
    		}
    		if(tablero.comprobarExistente(eleccionJugador)) imp("casilla ocupada, Elige otra\n");
    		else {
    			jugadaValida = tablero.cambiarPieza(eleccionJugador, true);     			
    			eleccionMaquina = maquina.eleccionMaquina(eleccionJugador);
    			imp("casilla seleccionada: " + eleccionJugador + "\n");
    			imp("Casilla maquina : " + eleccionMaquina + "\n");
    		}
    		
    		if(comprobarGanador("X")) {
    			tablero.imprimirTablero();
    			ganador = false;
    			imp("juego finalizado" + " Ganador: " + jugador1.GetNombreJugador());
    		}
    		if(comprobarGanador("O")) {
    			tablero.imprimirTablero();
    			ganador = false;
    			imp("juego finalizado" + " Ganador: " + maquina.GetNombreJugador());
    		}
    	
    		
		}
		scannerJugador.close();
	}
	public void imp(Object object) {
		System.out.print(object);
	}
	
	
	public boolean esEmpate() {
	    for (int i = 1; i <= 7; i++) {
	        for (int j = 0; j < 3; j++) {
	            if (tablero.matriz[i][j].trim().matches("[1-9]")) { 
	                return false;
	            }
	        }
	    }
	    return true; 
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
