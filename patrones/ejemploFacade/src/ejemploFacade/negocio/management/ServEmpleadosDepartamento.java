package ejemploFacade.negocio.management;

import java.util.ArrayList;
import java.util.List;

import ejemploFacade.data.Empleado;
import ejemploFacade.negocio.management.exceptions.ManagementException;
import ejemploFacade.negocio.management.interfaces.IServEmpleadosDepatamento;

public class ServEmpleadosDepartamento implements IServEmpleadosDepatamento {

	@Override
	public List<Empleado> dameEmpleadosDepartamento(int idDepartamento) throws ManagementException {
		List<Empleado> empleados;
		
		try {
			empleados= getDAOEmpleados(idDepartamento);
			
		} catch (Exception e) {
			throw new ManagementException();
		}
		return empleados;
	}
	
	private List<Empleado> getDAOEmpleados(int idDepartamento) {
		//LLAMADA AL DAO PARA QUE ME DE EMPLEADOS
		List<Empleado> empleados = new ArrayList<Empleado>();
		Empleado empleado = new Empleado();
		empleados.add(empleado);
		return empleados;
		
	}

}
