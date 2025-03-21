package contruccion_abstractFactory;

public class CursoJavaPresencial extends CursoJava{
	
	
	public String toString(){
		String descripcion = "CURSO APLICACIONES WEB PRESENCIAL";
		descripcion +=  "\nNIVEL:"+this.nivel;
		descripcion +=  "\nVERSION:"+this.version;
		return descripcion;
	}

	public CursoJavaPresencial() {
		super();
		this.nivel="INICIAL";
		this.version="8";
	}

	

}
