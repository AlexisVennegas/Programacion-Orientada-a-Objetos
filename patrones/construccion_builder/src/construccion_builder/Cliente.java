package construccion_builder;

import java.util.Scanner;


public class Cliente {

	 public static void main(String[] args)  
	    {  
	        Scanner reader = new Scanner(System.in);  
	        PizzaBuilder pizzaBuilder; 
	        System.out.print("Qué pizza quiere " +  
	          "carbonara (1), jamon-queso (2):");  
	        String seleccion = reader.next(); 
	        if (seleccion.equals("1"))  
	        {  
	        	pizzaBuilder = new PizzaCarbonaraBuilder();  
	        }  
	        else  
	        {  
	        	pizzaBuilder = new PizzaJamonQuesoBuilder(); 
	        }  
	        Pizzero pizzero = new Pizzero(pizzaBuilder);  
	        Pizza pizza = pizzero.hacerPizza();  
	        System.out.println(pizza.toString()); 
	        reader.close();
	    } 
}
