package ejemploFacade.negocio;

import java.util.ArrayList;
import java.util.List;

import ejemploFacade.data.Departamento;
import ejemploFacade.data.Empleado;
import ejemploFacade.data.Nomina;
import ejemploFacade.negocio.exceptions.NegocioException;
import ejemploFacade.negocio.interfaces.IService;
import ejemploFacade.negocio.management.GesDepartamento;
import ejemploFacade.negocio.management.GesEmpleado;
import ejemploFacade.negocio.management.ServEmpleadosDepartamento;
import ejemploFacade.negocio.management.ServNomina;
import ejemploFacade.negocio.management.exceptions.ManagementException;
import ejemploFacade.negocio.management.interfaces.IServEmpleadosDepatamento;
import ejemploFacade.negocio.management.interfaces.IServNomina;

public class ServiceImpl implements IService {
	
	GesEmpleado  gesEmpleado;
	GesDepartamento gesDepartamento;
	IServNomina servicioNomina;
	IServEmpleadosDepatamento servicioEmpleadosDepartamento;

	@Override
	public Empleado dameEmpleado(int idEmpleado) throws NegocioException {
		Empleado empleado = null;
		gesEmpleado = new GesEmpleado();
		try {
			empleado = gesEmpleado.getEmpleado(idEmpleado);
		} catch (ManagementException e) {
			new NegocioException();
		}catch (Exception e) {
			System.out.println("EXCEPCION GENERAL");
		}
		return empleado;
	}

	@Override
	public Nomina dameNomina(Empleado empleado) throws NegocioException {
		Nomina nomina = null;
		servicioNomina = new ServNomina();
		try {
			nomina = servicioNomina.dameNomina(empleado);
		} catch (ManagementException e) {
			new NegocioException();
		}catch (Exception e) {
			System.out.println("EXCEPCION GENERAL");
		}
		return nomina;
	}

	@Override
	public Departamento dameDepartamento(int idDepartamento) throws NegocioException {
		Departamento departamento = null;
		gesDepartamento = new GesDepartamento();
		try {
			departamento = gesDepartamento.getDepartamento(idDepartamento);
		} catch (ManagementException e) {
			new NegocioException();
		}catch (Exception e) {
			System.out.println("EXCEPCION GENERAL");
		}
		return departamento;
	}

	@Override
	public List<Empleado> dameEmpleadosDepartamento(int idDepartamento) throws NegocioException {
		List<Empleado> empleados = new ArrayList<Empleado>();
		servicioEmpleadosDepartamento = new ServEmpleadosDepartamento();
		try {
			empleados = servicioEmpleadosDepartamento.dameEmpleadosDepartamento(idDepartamento);
		} catch (ManagementException e) {
			new NegocioException();
		}catch (Exception e) {
			System.out.println("EXCEPCION GENERAL");
		}
		return empleados;
	}

}
