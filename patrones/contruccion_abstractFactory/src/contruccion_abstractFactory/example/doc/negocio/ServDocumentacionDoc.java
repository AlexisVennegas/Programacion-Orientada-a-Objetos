package contruccion_abstractFactory.example.doc.negocio;

import contruccion_abstractFactory.example.doc.data.CartaBienvenida;
import contruccion_abstractFactory.example.doc.data.Cliente;
import contruccion_abstractFactory.example.doc.data.FormInscripcion;
import contruccion_abstractFactory.example.doc.data.Justificante;
import contruccion_abstractFactory.example.doc.data.format.CartaBienvenidaDoc;
import contruccion_abstractFactory.example.doc.data.format.FormInscripcionDoc;
import contruccion_abstractFactory.example.doc.data.format.JustificanteDoc;
import contruccion_abstractFactory.example.doc.negocio.interfaces.IServDocumentacion;

public class ServDocumentacionDoc implements IServDocumentacion {

	String[] plantillas = {"PLANTILLA JUSTIFICANTE", "PLANTILLA INSCRIPCION",  "PLANTILLA BIENVENIDA"};

	@Override
	public Justificante generarJustificante() {
		int numJustificante = ServGeneraNumJustificante.generarNumJustificante();
		return new JustificanteDoc(numJustificante);
	}

	@Override
	public FormInscripcion generarFormInscripcion() {
		Cliente cliente = ControlSession.getCliente();
		return new FormInscripcionDoc(cliente.getNumSocio());
	}

	@Override
	public CartaBienvenida generarCartaBienvenida() {
		return new CartaBienvenidaDoc();
	}

}
