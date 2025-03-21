package ejemploFacade.negocio.management;

import ejemploFacade.data.Empleado;
import ejemploFacade.negocio.management.exceptions.ManagementException;

public class GesEmpleado {



	public Empleado getEmpleado(int idEmpleado) throws ManagementException {

		Empleado empleado;
		try {
			empleado= getDAOEmpleado(idEmpleado);

		} catch (Exception e) {
			throw new ManagementException();
		}
		return empleado;
	}

	private Empleado getDAOEmpleado(int idEmpleado) {
		//LLAMADA AL DAO PARA QUE ME DE EL EMPLEADO
		return new Empleado();

	}

}
