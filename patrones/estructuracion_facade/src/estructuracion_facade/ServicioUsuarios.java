package estructuracion_facade;

import java.util.ArrayList;
import java.util.List;

public class ServicioUsuarios implements IServicioUsuarios {

	public List<Usuario> getUsuarios() {
		List<Usuario> usuarios = new ArrayList<Usuario>();
		usuarios.add(new Usuario(1,"PEPE"));
		usuarios.add(new Usuario(2,"JUAN"));
		usuarios.add(new Usuario(3,"ANTONIO"));
		return null;
	}

	public Empleado getEmpleado(int idEmpleado) {
		return new Empleado(idEmpleado, "JUAN");
	}

}
