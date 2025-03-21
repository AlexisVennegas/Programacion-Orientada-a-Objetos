package ejemploFacade.negocio.management.interfaces;

import ejemploFacade.data.Empleado;
import ejemploFacade.data.Nomina;
import ejemploFacade.negocio.management.exceptions.ManagementException;

public interface IServNomina {
	
	public Nomina dameNomina(Empleado empleado) throws ManagementException;

}
