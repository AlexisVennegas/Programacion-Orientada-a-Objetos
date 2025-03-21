package comportamiento_strategy.libro;

import java.util.*;  
public class DibujaUnVehiculoPorLinea implements DibujaCatalogo  
{  
  
    public void dibuja(List<VistaVehiculo> contenido)  
    {  
        System.out.println(  
          "Dibuja los vehiculos mostrando un vehiculo por linea");  
        for (VistaVehiculo vistaVehiculo: contenido)  
        {  
            vistaVehiculo.dibuja();  
            System.out.println();  
        }  
        System.out.println();  
    }  
}
