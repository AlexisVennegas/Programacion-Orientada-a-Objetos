package estructuracion_facade;

public class Empleado extends Usuario {
	
	private double numeroEmpleado;

	public Empleado(int id, String nombre) {
		super(id, nombre);
	}

	public double getNumeroEmpleado() {
		numeroEmpleado = Math.random();
		return numeroEmpleado;
	}

	public void setNumeroEmpleado(double numeroEmpleado) {
		this.numeroEmpleado = numeroEmpleado;
	}
	
	

}
