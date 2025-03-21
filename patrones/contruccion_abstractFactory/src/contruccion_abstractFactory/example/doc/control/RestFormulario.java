package contruccion_abstractFactory.example.doc.control;

import contruccion_abstractFactory.example.doc.data.FormInscripcion;
import contruccion_abstractFactory.example.doc.negocio.ServDocumentacionDoc;
import contruccion_abstractFactory.example.doc.negocio.ServDocumentacionPDF;
import contruccion_abstractFactory.example.doc.negocio.ServDocumentacionTXT;
import contruccion_abstractFactory.example.doc.negocio.interfaces.IServDocumentacion;

public class RestFormulario {
	
	IServDocumentacion servicio;
	
	
	public FormInscripcion dameFormularioPDF(){
		servicio = new ServDocumentacionPDF();
		return servicio.generarFormInscripcion();
	}
	
	public FormInscripcion dameFormularioDOC(){
		servicio = new ServDocumentacionDoc();
		return servicio.generarFormInscripcion();
	}
	
	
	public FormInscripcion dameFormularioTXT(){
		servicio = new ServDocumentacionTXT();
		return servicio.generarFormInscripcion();
	}

}
