package com.gesres.data;

import com.gesres.common.Platos;

@SuppressWarnings("serial")
public class HuevosConChorizo extends Plato {

	public HuevosConChorizo() {
		super(Platos.HUEVOS_CON_CHORIZO);
		this.ingredientes.add(new Huevos(2));
		this.ingredientes.add(new Chorizo(200));
	}

}
