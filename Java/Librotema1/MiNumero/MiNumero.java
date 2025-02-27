package MiNumero;

public class MiNumero {
	
	private int numero;
	
	MiNumero() {
		this.numero = 0;
	}
	public MiNumero(int num) {
		this.numero = num;
	}
	public void cambiarNumero(int num) {
		this.numero = num;
	}
	public void sum(int num) {
		System.out.println("hola" + num);
		this.numero += num;
	}
	public void resta(int num) {
		this.numero -= num;
	}
	public int getValor() {
		return(this.numero);
	}
	public int getDouble() {
		return this.numero *= 2;
	}
	public int getTripe() {
		return this.numero *= 3;
	}
	public int getCuadrupe() {
		return this.numero *= 4;
	}
}
