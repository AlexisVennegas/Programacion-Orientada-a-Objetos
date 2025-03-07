package correctTresEnRaya;

public class Tablero {
	
	
	public String[][] matriz;
	public Tablero() {
		this.matriz = new String[7][3];

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
	
	public String[][] getMatriz() {
		return(this.matriz);
	}
	
	
	public void imprimirTablero( ) {
		for(int i = 0; i < 3; i++) {
			
			for(int j = 0; j < 7; j++) {
				   System.out.print(matriz[j][i]);
			}
			   System.out.print("-\n");
		}
		
	}
	public  boolean comprobarExistente(String Casilla) {
		  for (int i = 0; i < 7; i++) { 
		        for (int j = 0; j < 3; j++) { 
		            if (Casilla.equals(matriz[i][j].trim())) { 
		             return(false);
		        }
		       }
		  }
		  return(true);
	}
	public boolean cambiarPieza(String casillaJugador, boolean jugador) {
	    for (int i = 0; i < 7; i++) { 
	        for (int j = 0; j < 3; j++) { 
	            if (casillaJugador.equals(matriz[i][j].trim()) && jugador) { 
	               matriz[i][j] = " X ";  
	                //Imp("Entré al if\n");
	                return true; 
	            }
	            else if (casillaJugador.equals(matriz[i][j].trim()) && !(jugador)) { 
	                matriz[i][j] = " O ";  
	              
	              
	            } 
	        }}
	    return true; 
	    }
}
