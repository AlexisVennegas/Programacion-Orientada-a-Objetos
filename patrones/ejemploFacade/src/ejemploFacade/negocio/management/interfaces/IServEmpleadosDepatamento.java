package ejemploFacade.negocio.management.interfaces;

import java.util.List;

import ejemploFacade.data.Empleado;
import ejemploFacade.negocio.management.exceptions.ManagementException;

public interface IServEmpleadosDepatamento {
	
	public List<Empleado> dameEmpleadosDepartamento(int idDepartamento) throws ManagementException;

}
