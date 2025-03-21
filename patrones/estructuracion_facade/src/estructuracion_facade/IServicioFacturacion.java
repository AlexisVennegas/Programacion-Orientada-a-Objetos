package estructuracion_facade;

import java.util.List;

public interface IServicioFacturacion {

	List<Factura> getFacturas(int idCliente);

}
