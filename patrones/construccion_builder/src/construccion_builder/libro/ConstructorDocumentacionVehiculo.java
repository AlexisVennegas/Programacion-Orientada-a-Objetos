package construccion_builder.libro;

public abstract class ConstructorDocumentacionVehiculo  
{  
	protected Documentacion documentacion;  

	public abstract void construyeSolicitudPedido(String  
			nombreCliente);  

	public abstract void construyeSolicitudMatriculacion  
	(String nombreSolicitante);  

	public Documentacion resultado()  
	{  
		return documentacion;  
	}  
}  

