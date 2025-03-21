package estructuracion_facade.libro;

import java.util.List;  
public class WebServiceAutoImpl implements WebServiceAuto  
{  
    protected Catalogo catalogo = new ComponenteCatalogo();  
    protected GestionDocumento gestionDocumento = new  
      ComponenteGestionDocumento();  
  
    public String documento(int indice)  
    {  
        return gestionDocumento.documento(indice);  
    }  
  
    public List<String> buscaVehiculos(int precioMedio,  
      int desviacionMax)  
    {  
        return catalogo.buscaVehiculos(precioMedio -  
          desviacionMax, precioMedio + desviacionMax);  
    }  
}
