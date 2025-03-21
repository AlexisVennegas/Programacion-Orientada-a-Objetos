package contruccion_abstractFactory;

import java.util.Scanner;

public class Catalogo  
{  
  
  public static void main(String[] args)  
  {  
    Scanner reader = new Scanner(System.in);  
    FabricaCurso fabrica;  
    System.out.print("Desea cursar " +  
      "de forma online (1) o presencial (2):");  
    String eleccion = reader.next();  
    if (eleccion.equals("1"))  
    {  
      fabrica = new FabricaCursoOnLine();  
    }  
    else  
    {  
      fabrica = new FabricaCursoPresencial();  
    }  
    System.out.println(fabrica.creaCursoJava().toString());
    System.out.println(fabrica.creaCursoAplicacionesWeb().toString());
    reader.close();
  }
}
