package comportamiento_observer.libro;

public class Usuario  
{  
    public static void main(String[] args)  
    {  
       Vehiculo vehiculo = new Vehiculo();  
       vehiculo.setDescripcion("Vehiculo economico");  
       vehiculo.setPrecio(5000.0);  
       VistaVehiculo vistaVehiculo = new VistaVehiculo(vehiculo);  
       vistaVehiculo.redibuja();  
       vehiculo.setPrecio(4500.0);  
       VistaVehiculo vistaVehiculo2 = new VistaVehiculo(vehiculo); 
       vehiculo.setPrecio(5500.0);  
    }  
}
