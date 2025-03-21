package contruccion_abstractFactory;

public class FabricaCursoOnLine extends FabricaCurso{

	@Override
	CursoJava creaCursoJava() {
		return new CursoJavaOnLine();
	}

	@Override
	CursoAplicacionesWeb creaCursoAplicacionesWeb() {
		return new CursoAplicacionesWebOnLine();
	}

}
