package contruccion_abstractFactory.example.doc.data.format;

import contruccion_abstractFactory.example.doc.data.CartaBienvenida;

public class CartaBienvenidaDoc extends CartaBienvenida {

	public CartaBienvenidaDoc() {
		super();
		this.setTextoBienvenida(getTextoBienvenida().concat(" FORMATO DOC"));
	}

}
