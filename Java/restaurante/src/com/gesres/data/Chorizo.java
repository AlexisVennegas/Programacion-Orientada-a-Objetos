package com.gesres.data;

import com.gesres.common.Ingredientes;

public class Chorizo extends Ingrediente {

	public Chorizo() {
		super(Ingredientes.CHORIZO,Ingredientes.KG);
		
	}

	public Chorizo(int cantidad) {
		super(Ingredientes.CHORIZO,Ingredientes.KG,cantidad);
	}

}
