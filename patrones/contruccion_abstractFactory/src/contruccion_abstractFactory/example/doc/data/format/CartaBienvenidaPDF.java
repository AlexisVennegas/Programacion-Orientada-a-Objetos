package contruccion_abstractFactory.example.doc.data.format;

import contruccion_abstractFactory.example.doc.data.CartaBienvenida;

public class CartaBienvenidaPDF extends CartaBienvenida {

	public CartaBienvenidaPDF() {
		super();
		this.setTextoBienvenida(getTextoBienvenida().concat(" FORMATO PDF"));
	}

}
