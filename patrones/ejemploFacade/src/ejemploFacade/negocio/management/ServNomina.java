package ejemploFacade.negocio.management;

import java.util.ArrayList;
import java.util.List;

import ejemploFacade.data.Empleado;
import ejemploFacade.data.Nomina;
import ejemploFacade.negocio.management.exceptions.ManagementException;
import ejemploFacade.negocio.management.interfaces.IServNomina;

public class ServNomina implements IServNomina {

	@Override
	public Nomina dameNomina(Empleado empleado) throws ManagementException {
		
		Nomina nomina;
		try {
			nomina= getDAONomina(empleado.getId());
			
		} catch (Exception e) {
			throw new ManagementException();
		}
		return nomina;
	}

	private Nomina getDAONomina(int idEmpleado) {
		//LLAMADA AL DAO PARA QUE ME DE LA NOMINA
		return new Nomina();
		
	}
}
