package estructuracion_facade;

import java.util.ArrayList;
import java.util.List;

public class ServicioFacturacion implements IServicioFacturacion {

	public List<Factura> getFacturas(int idCliente) {
		List<Factura> facturas = new ArrayList<Factura>();
		for(int i=0;i<5;i++){
			facturas.add(new Factura(i));
		}
		return facturas;
	}

}
