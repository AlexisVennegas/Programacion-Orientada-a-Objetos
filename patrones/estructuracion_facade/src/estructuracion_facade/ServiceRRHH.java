package estructuracion_facade;

import java.util.List;

public class ServiceRRHH implements IServiceRRHH {
	
	private IServicioUsuarios servicioUsuarios;
	private IServicioFacturacion servicioFacturacion;
	private IServicioFormacion servicioFormacion;
	

	@Override
	public List<Usuario> conseguirUsuarios() {
		if(servicioUsuarios== null)
			servicioUsuarios = new ServicioUsuarios();
		return servicioUsuarios.getUsuarios();
	}

	@Override
	public Empleado conseguirEmpleado(int idEmpleado) {
		if(servicioUsuarios== null)
			servicioUsuarios = new ServicioUsuarios();
		return servicioUsuarios.getEmpleado(idEmpleado);
	}

	@Override
	public List<Factura> conseguirFactura(int idCliente) {
		servicioFacturacion = new ServicioFacturacion();
		return servicioFacturacion.getFacturas(idCliente);
	}

	@Override
	public List<Curso> conseguirCursosImpartidos(int idEmpleado) {
		servicioFormacion = new ServicioFormacion();
		return servicioFormacion.getCursosImpartidos(idEmpleado);
	}

}
