package estructuracion_facade;

import java.util.List;

public interface IServicioUsuarios {

	List<Usuario> getUsuarios();

	Empleado getEmpleado(int idEmpleado);

}
