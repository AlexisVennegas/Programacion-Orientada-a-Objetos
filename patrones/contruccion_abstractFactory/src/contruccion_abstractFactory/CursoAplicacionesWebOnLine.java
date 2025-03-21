package contruccion_abstractFactory;

public class CursoAplicacionesWebOnLine extends CursoAplicacionesWeb{
	
	
	public String toString(){
		String descripcion = "CURSO APLICACIONES WEB ON-LINE";
		descripcion +=  "\nNIVEL:"+this.nivel;
		return descripcion;
	}
	public CursoAplicacionesWebOnLine() {
		super();
		this.nivel="INICIAL";
	}
	

}
