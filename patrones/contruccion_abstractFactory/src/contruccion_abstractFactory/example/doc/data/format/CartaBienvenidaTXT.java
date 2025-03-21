package contruccion_abstractFactory.example.doc.data.format;

import contruccion_abstractFactory.example.doc.data.CartaBienvenida;

public class CartaBienvenidaTXT extends CartaBienvenida {

	public CartaBienvenidaTXT() {
		super();
		this.setTextoBienvenida(getTextoBienvenida().concat(" FORMATO TXT"));
	}

}
