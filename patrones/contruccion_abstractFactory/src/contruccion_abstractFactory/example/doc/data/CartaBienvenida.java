package contruccion_abstractFactory.example.doc.data;

import contruccion_abstractFactory.example.doc.common.Constante;

public abstract class CartaBienvenida {

	private String textoBienvenida;
	
	public String getTextoBienvenida(){
		if(textoBienvenida == null) textoBienvenida= Constante.TEXTO_DEFECTO_BIENVENIDA;
		return  textoBienvenida;
	}
	
	public void setTextoBienvenida(String textoBienvenida){
		this.textoBienvenida = textoBienvenida;
	}

}
