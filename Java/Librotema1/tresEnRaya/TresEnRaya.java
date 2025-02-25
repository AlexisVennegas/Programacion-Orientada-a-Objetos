package tresEnRaya;

import java.util.Scanner;

public class TresEnRaya {

	public int casillaJugador;
	public static int[][] matriz = new int[3][3]; 
	
	
	public static void Imp(Object object) {
		System.out.print(object);
	}
	
	public static void ImprimirTablero() {
		for(int i = 0; i < 3; i++) {
			Imp(" | ");
			for(int j = 0; j < 3; j++) {
				Imp(matriz[j][i] + " | ");
			}
			Imp("\n");
		}
		iniciarJuego();
	}
	
	
	public static void cambiarPieza(int casillaJugador) {
		
		
		
        int fila = (casillaJugador - 1) / 3; 
        int columna = (casillaJugador - 1) % 3;  
        
       
        if(matriz[fila][columna] == 0) { // Solo cambiar si está vacía
            matriz[fila][columna] = 1; // 1 representa la pieza del jugador
        } else {
            Imp("La casilla ya está ocupada. Elige otra.\n");
        }
        
      
        ImprimirTablero();
	}
	
	public static void iniciarJuego() {
		
		 Imp("buenas, elige casilla: ");
		 Scanner scanner = new Scanner(System.in);
		 int casillaJugador = scanner.nextInt();
		 scanner.close();
		 cambiarPieza(casillaJugador);
	}
	
	
	
	
	
	 public static void main(String[] args) {
	       
	        int[][] matriz = new int[3][3]; 

	     
	        ImprimirTablero();
	    }
}
