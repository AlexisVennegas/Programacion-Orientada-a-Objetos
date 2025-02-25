package tresEnRaya;

import java.util.Scanner;

public class TresEnRaya {

	public int casillaJugador;
	
	public static void Imp(Object object) {
		System.out.print(object);
	}
	
	public static void ImprimirTablero(int[][] matriz) {
		for(int i = 0; i < 3; i++) {
			Imp(" | ");
			for(int j = 0; j < 3; j++) {
				Imp(matriz[0][j] + " | ");
			
			}
			Imp("\n");
			iniciarJuego();
		}
	}
	
	
	public void iniciarJuego() {
		int[][] matriz = new int[3][3]; 
		Imp("buenas, elige casilla: ");
		 Scanner scanner = new Scanner(System.in);
		 String casillaJugador = scanner.nextLine();
		 scanner.close();
		 
	}
	
	
	
	
	
	 public static void main(String[] args) {
	       
	        int[][] matriz = new int[3][3]; 

	     
	        ImprimirTablero(matriz);
	    }
}
