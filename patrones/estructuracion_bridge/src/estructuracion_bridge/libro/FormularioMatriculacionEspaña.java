package estructuracion_bridge.libro;

public class FormularioMatriculacionEspaña extends FormularioMatriculacion {
	public FormularioMatriculacionEspaña(FormularioImpl implementacion) {
		super(implementacion);
	}

	protected boolean controlZona(String matricula) {
		return matricula.length() == 7;
	}
}
