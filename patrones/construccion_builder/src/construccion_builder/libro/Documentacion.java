package construccion_builder.libro;

import java.util.ArrayList;
import java.util.List;

public abstract class Documentacion  
{  
    protected List<String> contenido =  
        new ArrayList<String>();  
  
    public abstract void agregaDocumento(String documento);  
    public abstract void imprime();  
}  
  

