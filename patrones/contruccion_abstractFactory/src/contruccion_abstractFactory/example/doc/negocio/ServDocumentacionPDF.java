package contruccion_abstractFactory.example.doc.negocio;

import contruccion_abstractFactory.example.doc.data.CartaBienvenida;
import contruccion_abstractFactory.example.doc.data.Cliente;
import contruccion_abstractFactory.example.doc.data.FormInscripcion;
import contruccion_abstractFactory.example.doc.data.Justificante;
import contruccion_abstractFactory.example.doc.data.format.CartaBienvenidaPDF;
import contruccion_abstractFactory.example.doc.data.format.FormInscripcionPDF;
import contruccion_abstractFactory.example.doc.data.format.JustificantePDF;
import contruccion_abstractFactory.example.doc.negocio.interfaces.IServDocumentacion;

public class ServDocumentacionPDF implements IServDocumentacion {

	
	@Override
	public Justificante generarJustificante() {
		int numJustificante = ServGeneraNumJustificante.generarNumJustificante();
		return new JustificantePDF(numJustificante);
	}

	@Override
	public FormInscripcion generarFormInscripcion() {
		Cliente cliente = ControlSession.getCliente();
		return new FormInscripcionPDF(cliente.getNumSocio());
	}

	@Override
	public CartaBienvenida generarCartaBienvenida() {
		return new CartaBienvenidaPDF();
	}

}
