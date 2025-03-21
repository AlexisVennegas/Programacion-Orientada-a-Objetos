package contruccion_abstractFactory.example.doc.control;

import contruccion_abstractFactory.example.doc.data.CartaBienvenida;
import contruccion_abstractFactory.example.doc.data.FormInscripcion;
import contruccion_abstractFactory.example.doc.data.Justificante;
import contruccion_abstractFactory.example.doc.negocio.ServDocumentacionPDF;
import contruccion_abstractFactory.example.doc.negocio.interfaces.IServDocumentacion;

public class RestDocumentosPDF {
	
	IServDocumentacion servicio = new ServDocumentacionPDF();
	
	
	public Justificante generarJustificante(){
		
		return servicio.generarJustificante();
	}
	
	public FormInscripcion generarFormInscripcion(){
		
		return servicio.generarFormInscripcion();
		
	}
	public CartaBienvenida generarCartaBienvenida(){
		
		return servicio.generarCartaBienvenida();
		
	}

}
