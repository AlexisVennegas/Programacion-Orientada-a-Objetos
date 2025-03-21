package estructuracion_facade;

import java.util.List;

public abstract interface IServiceRRHH {
	
	public abstract List<Usuario> conseguirUsuarios();
	
	public abstract Empleado conseguirEmpleado(int idEmpleado);
	
	public abstract List<Factura> conseguirFactura(int idCliente);
	
	public abstract List<Curso> conseguirCursosImpartidos(int idEmpleado);
	

}
