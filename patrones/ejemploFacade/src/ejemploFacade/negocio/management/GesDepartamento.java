package ejemploFacade.negocio.management;

import ejemploFacade.data.Departamento;
import ejemploFacade.negocio.management.exceptions.ManagementException;

public class GesDepartamento {



	public Departamento getDepartamento(int idDepartamento) throws ManagementException {

		Departamento departamento;
		try {
			departamento= getDAODepartamento(idDepartamento);

		} catch (Exception e) {
			throw new ManagementException();
		}
		return departamento;
	}

	private Departamento getDAODepartamento(int idDepartamento) {
		//LLAMADA AL DAO PARA QUE ME DE EL DEPARTAMENTO
		return new Departamento();

	}

}
