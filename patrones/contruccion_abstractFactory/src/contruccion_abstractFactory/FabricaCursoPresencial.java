package contruccion_abstractFactory;

public class FabricaCursoPresencial extends FabricaCurso{

	@Override
	CursoJava creaCursoJava() {
		return new CursoJavaPresencial();
	}

	@Override
	CursoAplicacionesWeb creaCursoAplicacionesWeb() {
		return new CursoAplicacionesWebPresencial();
	}

}
