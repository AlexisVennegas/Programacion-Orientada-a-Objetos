package contruccion_abstractFactory.example.doc;

import java.util.Scanner;

import contruccion_abstractFactory.example.doc.data.FormInscripcion;
import contruccion_abstractFactory.example.doc.negocio.ServDocumentacionDoc;
import contruccion_abstractFactory.example.doc.negocio.ServDocumentacionPDF;
import contruccion_abstractFactory.example.doc.negocio.ServDocumentacionTXT;
import contruccion_abstractFactory.example.doc.negocio.interfaces.IServDocumentacion;

public class Catalogo  
{  
  public static int nAutos = 3;  
  public static int nScooters = 2;  
  
  public static void main(String[] args)  
  {  
    Scanner reader = new Scanner(System.in);  
    IServDocumentacion servDocumentacion;  
    System.out.print("Desea generar " +  
      "documentos pdf (1) doc (2) txt (3):");  
    String eleccion = reader.next();  
    if (eleccion.equals("1"))  
    {  
    	servDocumentacion = new ServDocumentacionPDF();  
    }  
    else if (eleccion.equals("2")) 
    {  
      servDocumentacion = new ServDocumentacionDoc();  
    }  
    else  
    {  
      servDocumentacion = new ServDocumentacionTXT();  
    }  
    
    FormInscripcion form = servDocumentacion.generarFormInscripcion();
      System.out.println("FORMULARIO INSCRIPCION:"+ form.getNumsocio());
      System.out.println("FORMULARIO INSCRIPCION:"+ form.getClass());
    

    reader.close();
  }
}
