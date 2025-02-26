package tresEnRaya;

import java.util.Scanner;

public class TresEnRaya {

	public int casillaJugador;
	public static String[][] matriz = new String[7][3];
	

		static {
		  
		    //  primera fila 
		    matriz[0][0] = " | ";
		    matriz[1][0] = " 1 ";
		    matriz[2][0] = " | ";
		    matriz[3][0] = " 2 ";
		    matriz[4][0] = " | ";
		    matriz[5][0] = " 3 ";
		    matriz[6][0] = " | ";

		    // Segunda fila
		    matriz[0][1] = " | ";
		    matriz[1][1] = " 4 ";
		    matriz[2][1] = " | ";
		    matriz[3][1] = " 5 ";
		    matriz[4][1] = " | ";
		    matriz[5][1] = " 6 ";
		    matriz[6][1] = " | ";
		    

		    // Tercer fila
		    matriz[0][2] = " | ";
		    matriz[1][2] = " 7 ";
		    matriz[2][2] = " | ";
		    matriz[3][2] = " 8 ";
		    matriz[4][2] = " | ";
		    matriz[5][2] = " 9 ";
		    matriz[6][2] = " | ";



		
	}
	
	
	public static void Imp(Object object) {
		System.out.print(object);
	
	}
	
	
	
	public static void ImprimirTablero() {
		for(int i = 0; i < 3; i++) {
			
			for(int j = 0; j < 7; j++) {
				Imp(matriz[j][i]);
			}
			Imp("\n");
		}
	
	}
	
	public static boolean comprobarExistente(String Casilla) {
		  for (int i = 0; i < 7; i++) { 
		        for (int j = 0; j < 3; j++) { 
		            if (Casilla.equals(matriz[i][j].trim())) { 
		             return(false);
		        }
		       }
		  }
		  return(true);
	}
	
	
    public static boolean cambiarPieza(String casillaJugador, boolean jugador) {
    for (int i = 0; i < 7; i++) { 
        for (int j = 0; j < 3; j++) { 
            if (casillaJugador.equals(matriz[i][j].trim()) && jugador) { 
                matriz[i][j] = " X ";  
                //Imp("Entré al if\n");
                return true; 
            }
            else if (casillaJugador.equals(matriz[i][j].trim()) && !(jugador)) { 
                matriz[i][j] = " O ";  
              
                return true; 
            } 
        }
    }
    

    Imp("Casilla no encontrada || ocupada\n");  
    return false;  
}

    
    public static boolean comprobarGanador(String casilla) {
    
    	if (matriz[1][0].trim().equals(casilla) && matriz[3][0].trim().equals(casilla) && matriz[5][0].trim().equals(casilla)) return true;
        if (matriz[1][1].trim().equals(casilla) && matriz[3][1].trim().equals(casilla) && matriz[5][1].trim().equals(casilla)) return true;
        if (matriz[1][2].trim().equals(casilla) && matriz[3][2].trim().equals(casilla) && matriz[5][2].trim().equals(casilla)) return true;
       
        if (matriz[1][0].trim().equals(casilla) && matriz[1][1].trim().equals(casilla) && matriz[1][2].trim().equals(casilla)) return true;
        if (matriz[3][0].trim().equals(casilla) && matriz[3][1].trim().equals(casilla) && matriz[3][2].trim().equals(casilla)) return true;
        if (matriz[5][0].trim().equals(casilla) && matriz[5][1].trim().equals(casilla) && matriz[5][2].trim().equals(casilla)) return true;

        if (matriz[1][0].trim().equals(casilla) && matriz[3][1].trim().equals(casilla) && matriz[5][2].trim().equals(casilla)) return true;
        if (matriz[5][0].trim().equals(casilla) && matriz[3][1].trim().equals(casilla) && matriz[1][2].trim().equals(casilla)) return true;
        
        
       
    	
    	return(false);
       
    }

    
    public static String eleccionMaquina(String casillaJugador) {
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
    
    public static void iniciarJuego() {
    	
    	boolean ganador = true;  // 🔹 Inicialmente no hay ganador
    	String eleccionMaquina = "";
    	Scanner scanner = new Scanner(System.in);
    	String casillaJugador;
    	boolean jugadaValida = false;
    	
    	
    	
    	
    	while (ganador) {  
    		ImprimirTablero();
    		Imp("Elige casilla: (1-9)\n");
    		Imp("X: Jugador || O: Máquina\n");

    		casillaJugador = scanner.next();
    		if(comprobarExistente(casillaJugador)) {
    			Imp("casilla ocupada, Elige otra\n");
    			//casillaJugador = scanner.next();
    		}else {
    			jugadaValida = cambiarPieza(casillaJugador, true);     			
    			eleccionMaquina = eleccionMaquina(casillaJugador);
    			Imp("casilla seleccionada: " + casillaJugador + "\n");
    			Imp("Casilla maquina : " + eleccionMaquina + "\n");
    		}
    		if(comprobarGanador("X") || comprobarExistente("O")) 
    		{
    			ImprimirTablero();
    			ganador = false;
    			Imp("juego finalizado");
    		}
    	
    	
    	
    	}
    	
    	scanner.close();
    }
	
	
	 public static void main(String[] args) {
		 iniciarJuego();
	    }
}
