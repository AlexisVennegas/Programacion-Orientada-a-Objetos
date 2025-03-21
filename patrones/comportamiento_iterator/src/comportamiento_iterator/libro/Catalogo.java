package comportamiento_iterator.libro;

import java.util.*;  
public abstract class Catalogo  
    <TElemento extends Elemento,  
    TIterador extends Iterador<TElemento>> 
{  
    protected List<TElemento> contenido =  
      new ArrayList<TElemento>();  
  
    protected abstract TIterador creaIterador(); 
  
    public TIterador busqueda(String palabraClaveConsulta)  
    {  
        TIterador resultado = creaIterador();  
        resultado.setPalabraClaveConsulta(palabraClaveConsulta,  
            contenido);  
        return resultado;  
    }  
}
