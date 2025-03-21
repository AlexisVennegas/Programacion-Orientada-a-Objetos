package comportamiento_strategy.libro;

import java.util.*;  
public class DibujaTresVehiculosPorLinea implements DibujaCatalogo  
{  
    public void dibuja(List<VistaVehiculo> contenido)  
    {  
        int contador;  
        System.out.println(  
          "Dibuja los vehiculos mostrando tres vehiculos por linea");  
        contador = 0;  
        for (VistaVehiculo vistaVehiculo: contenido)  
        {  
            vistaVehiculo.dibuja();  
            contador++;  
            if (contador == 3)  
            {  
                System.out.println();  
                contador = 0;  
            }  
            else  
                System.out.println(" ");  
        }  
        if (contador != 0)  
            System.out.println();  
        System.out.println();  
    }  
}