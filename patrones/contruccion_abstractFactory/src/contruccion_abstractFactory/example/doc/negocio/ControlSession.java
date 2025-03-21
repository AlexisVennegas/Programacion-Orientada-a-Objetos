package contruccion_abstractFactory.example.doc.negocio;

import contruccion_abstractFactory.example.doc.data.Cliente;

public class ControlSession {
	
	public static Cliente getCliente(){
		return new Cliente();
	}

}
