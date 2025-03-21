package contruccion_abstractFactory.example.doc.negocio;

import contruccion_abstractFactory.example.doc.data.CartaBienvenida;
import contruccion_abstractFactory.example.doc.data.Cliente;
import contruccion_abstractFactory.example.doc.data.FormInscripcion;
import contruccion_abstractFactory.example.doc.data.Justificante;
import contruccion_abstractFactory.example.doc.data.format.CartaBienvenidaTXT;
import contruccion_abstractFactory.example.doc.data.format.FormInscripcionTXT;
import contruccion_abstractFactory.example.doc.data.format.JustificanteTXT;
import contruccion_abstractFactory.example.doc.negocio.interfaces.IServDocumentacion;

public class ServDocumentacionTXT implements IServDocumentacion {

	
	@Override
	public Justificante generarJustificante() {
		int numJustificante = ServGeneraNumJustificante.generarNumJustificante();
		return new JustificanteTXT(numJustificante);
	}

	@Override
	public FormInscripcion generarFormInscripcion() {
		Cliente cliente = ControlSession.getCliente();
		return new FormInscripcionTXT(cliente.getNumSocio());
	}

	@Override
	public CartaBienvenida generarCartaBienvenida() {
		return new CartaBienvenidaTXT();
	}
	
	

}
