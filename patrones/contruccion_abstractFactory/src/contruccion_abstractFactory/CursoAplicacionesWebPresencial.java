package contruccion_abstractFactory;

public class CursoAplicacionesWebPresencial extends CursoAplicacionesWeb{
	
	
	public String toString(){
		String descripcion = "CURSO APLICACIONES WEB PRESENCIAL";
		descripcion +=  "\nNIVEL:"+this.nivel;
		return descripcion;
	}

	public CursoAplicacionesWebPresencial() {
		super();
		this.nivel="AVANZADO";
	}

	

}
