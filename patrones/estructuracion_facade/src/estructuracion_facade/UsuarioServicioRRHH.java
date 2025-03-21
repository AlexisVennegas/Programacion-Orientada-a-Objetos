package estructuracion_facade;

public class UsuarioServicioRRHH {
	
	public static void main(String[] args)  
	  {  
	    IServiceRRHH servicioRRHH = new  
	    		ServiceRRHH();  
	    System.out.println(servicioRRHH.conseguirEmpleado(2));  
	    System.out.println(servicioRRHH.conseguirCursosImpartidos(1));  
	    System.out.println(servicioRRHH.conseguirFactura(2));
	  }  

}
