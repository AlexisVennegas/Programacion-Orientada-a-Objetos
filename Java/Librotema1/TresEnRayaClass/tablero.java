package TresEnRayaClass;

public class tablero {
	
	public String[][] matriz;
	public  tablero(String[][] matriz) {
		
		this.matriz = new String[7][3];
		iniciarTablero();
	}
	
	public void iniciarTablero() {

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
}
