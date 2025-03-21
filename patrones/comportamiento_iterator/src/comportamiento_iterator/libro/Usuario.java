package comportamiento_iterator.libro;

public class Usuario  
{  
    public static void main(String[] args)  
    {  
        CatalogoVehiculo catalogo = new CatalogoVehiculo();  
        IteradorVehiculo iterador = catalogo.busqueda(  
          "economico");  
        Vehiculo vehiculo;  
        iterador.inicio();  
        vehiculo = iterador.item();  
        while (vehiculo != null)  
        {  
            vehiculo.visualiza();  
            iterador.siguiente();  
            vehiculo = iterador.item();  
        }  
    }  
}
