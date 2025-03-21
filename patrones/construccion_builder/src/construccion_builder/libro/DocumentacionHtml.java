package construccion_builder.libro;

public class DocumentacionHtml extends Documentacion  
{  
    public void agregaDocumento(String documento)  
    {  
        if (documento.startsWith("<HTML>"))  
            contenido.add(documento);  
    }  
  
    public void imprime()  
    {  
        System.out.println("Documentacion HTML");  
        for (String s: contenido)  
            System.out.println(s);  
    }  
}  
