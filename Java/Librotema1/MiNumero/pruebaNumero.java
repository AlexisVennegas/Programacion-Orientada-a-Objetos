package MiNumero;

public class pruebaNumero {

	public static void main(String[] args) {
		MiNumero numeroprueba;
		
		numeroprueba = new MiNumero();
		
		numeroprueba.cambiarNumero(5);
		
		System.out.println(numeroprueba.getValor());
		numeroprueba.sum(10);
		numeroprueba.resta(5);
		System.out.println("asd" + numeroprueba.getValor());
		System.out.println(numeroprueba.getDouble());
		System.out.println(numeroprueba.getTripe());
		System.out.println(numeroprueba.getCuadrupe());
	}

}
