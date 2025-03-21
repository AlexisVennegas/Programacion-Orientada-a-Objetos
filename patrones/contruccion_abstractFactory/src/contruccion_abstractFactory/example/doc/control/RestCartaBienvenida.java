package contruccion_abstractFactory.example.doc.control;

import contruccion_abstractFactory.example.doc.data.CartaBienvenida;
import contruccion_abstractFactory.example.doc.negocio.ServDocumentacionDoc;
import contruccion_abstractFactory.example.doc.negocio.ServDocumentacionPDF;
import contruccion_abstractFactory.example.doc.negocio.ServDocumentacionTXT;
import contruccion_abstractFactory.example.doc.negocio.interfaces.IServDocumentacion;

public class RestCartaBienvenida {
	
	IServDocumentacion servicio;
	
	
	public CartaBienvenida dameCartaBienvenidaPDF(){
		servicio = new ServDocumentacionPDF();
		return servicio.generarCartaBienvenida();
	}
	
	public CartaBienvenida dameCartaBienvenidaDOC(){
		servicio = new ServDocumentacionDoc();
		return servicio.generarCartaBienvenida();
	}
	
	
	public CartaBienvenida dameCartaBienvenidaTXT(){
		servicio = new ServDocumentacionTXT();
		return servicio.generarCartaBienvenida();
	}

}
