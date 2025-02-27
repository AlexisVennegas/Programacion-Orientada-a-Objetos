package Peso;

public class pruebaPeso {
	public static void main(String[] args) {
		Peso testPeso;
		
		testPeso = new Peso(20, "g");
		
		System.out.println(testPeso.unidad);
		System.out.println(testPeso.getLibras());
		System.out.println(testPeso.getPeso());
		System.out.println(testPeso.getOnzas());
	}
}
