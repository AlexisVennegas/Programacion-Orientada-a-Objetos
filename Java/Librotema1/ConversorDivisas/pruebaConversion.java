package ConversorDivisas;

public class pruebaConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConversorDivisas conversor;
		double euros;
		
		conversor = new ConversorDivisas();
		euros = 20;
		conversor.setTipoCambio(20);
		System.out.println(conversor.getTipoCambio());
	
		System.out.println(conversor.eurosToLibras(euros));
	}

}
