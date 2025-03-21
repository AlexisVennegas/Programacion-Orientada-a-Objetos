package contruccion_abstractFactory.example.doc.negocio.interfaces;

import contruccion_abstractFactory.example.doc.data.CartaBienvenida;
import contruccion_abstractFactory.example.doc.data.FormInscripcion;
import contruccion_abstractFactory.example.doc.data.Justificante;

public interface IServDocumentacion {
	
	public Justificante generarJustificante();
	public FormInscripcion generarFormInscripcion();
	public CartaBienvenida generarCartaBienvenida();

}
