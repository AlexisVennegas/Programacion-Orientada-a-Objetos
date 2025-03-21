package construccion_builder;

public class PizzaJamonQuesoBuilder extends PizzaBuilder{

	
	public void buildMasa(){
		pizza.setMasa("GRUESA");
	}
	public void buildSalsa(){
		pizza.setSalsa("TOMATE");
	}
	public void buildRelleno(){
		pizza.addIngrediente("JAMON");
		pizza.addIngrediente("QUESO");
	}
}
