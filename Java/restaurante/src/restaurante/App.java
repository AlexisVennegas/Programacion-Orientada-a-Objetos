package restaurante;

import com.gesres.bussiness.Restaurante;
import com.gesres.data.Huevos;

public class App {

	public static void main(String[] args) {
		
		Huevos ingrediente = new Huevos(12);
		
		Restaurante restaurante = new Restaurante();
		restaurante.addIngrediente(ingrediente);
	}

}
