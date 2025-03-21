package contruccion_abstractFactory;

public  class CursoJavaOnLine extends CursoJava{
	
	
	public String toString(){
		String descripcion = "CURSO JAVA ON-LINE";
		descripcion +=  "\nNIVEL:"+this.nivel;
		descripcion +=  "\nVERSION:"+this.version;
		return descripcion;
	}

	public CursoJavaOnLine() {
		super();
		this.nivel="AVANZADO";
		this.version="7";
	}

	

}
