package estructuracion_facade;

public class Factura {
	
	private int numeroFactura;
	private double importe;	
	
	
	public Factura(int numeroFactura) {
		super();
		this.numeroFactura = numeroFactura;
		this.importe = Math.random();
	}
	
	public int getNumeroFactura() {
		return numeroFactura;
	}
	public void setNumeroFactura(int numeroFactura) {
		this.numeroFactura = numeroFactura;
	}
	public double getImporte() {
		return importe;
	}
	public void setImporte(double importe) {
		this.importe = importe;
	}
	
	

}
