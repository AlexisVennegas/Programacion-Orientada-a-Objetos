package com.usoLambdas.interfacesFuncionales;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Repaso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<Integer> pr = a -> (a>5);
		System.out.println(pr);
		
		Predicate<Casa> pr2 = c -> c.getM2()<100; 
		
		Function<Casa, Double> func = c -> c.getM2();
		
	}
	
	Supplier<Casa> supplier  = () -> new Casa();

}
