package ejemploFacade.negocio.interfaces;

import java.util.List;

import ejemploFacade.data.Departamento;
import ejemploFacade.data.Empleado;
import ejemploFacade.data.Nomina;
import ejemploFacade.negocio.exceptions.NegocioException;

public interface IService {
	
	public Empleado dameEmpleado(int idEmpleado) throws NegocioException;
	
	public Nomina dameNomina(Empleado empleado) throws NegocioException;
	
	public Departamento dameDepartamento(int idDepartamento) throws NegocioException;
	
	public List<Empleado> dameEmpleadosDepartamento(int idDepartamento) throws NegocioException;

}
