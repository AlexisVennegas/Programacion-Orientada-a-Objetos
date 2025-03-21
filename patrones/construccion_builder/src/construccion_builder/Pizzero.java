package construccion_builder;

public class Pizzero {
	
	protected PizzaBuilder pizzaBuilder;

	public Pizzero(PizzaBuilder pizzaBuilder) {
		super();
		this.pizzaBuilder = pizzaBuilder;
	}
	
	public Pizza hacerPizza(){
		
		pizzaBuilder.crearNuevaPizza();
		pizzaBuilder.buildMasa();
		pizzaBuilder.buildSalsa();	
		pizzaBuilder.buildRelleno();	
		
		return pizzaBuilder.getPizza();		
		
	}

}
