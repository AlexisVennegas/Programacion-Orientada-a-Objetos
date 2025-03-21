package contruccion_abstractFactory.example.doc.control;

import contruccion_abstractFactory.example.doc.data.Justificante;
import contruccion_abstractFactory.example.doc.negocio.ServDocumentacionDoc;
import contruccion_abstractFactory.example.doc.negocio.ServDocumentacionPDF;
import contruccion_abstractFactory.example.doc.negocio.ServDocumentacionTXT;
import contruccion_abstractFactory.example.doc.negocio.interfaces.IServDocumentacion;

public class RestJustificante {
	
	IServDocumentacion servicio;
	
	
	public Justificante dameFormularioPDF(){
		servicio = new ServDocumentacionPDF();
		return servicio.generarJustificante();
	}
	
	public Justificante dameFormularioDOC(){
		servicio = new ServDocumentacionDoc();
		return servicio.generarJustificante();
	}
	
	
	public Justificante dameFormularioTXT(){
		servicio = new ServDocumentacionTXT();
		return servicio.generarJustificante();
	}

}
