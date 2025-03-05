package com.gesres.data;

import com.gesres.common.Ingredientes;

public class Huevos extends Ingrediente {

	public Huevos() {
		super(Ingredientes.HUEVOS,Ingredientes.DOCENAS);
		
	}

	public Huevos(int cantidad) {
		super(Ingredientes.HUEVOS,Ingredientes.DOCENAS,cantidad);
	}

}
