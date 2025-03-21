package estructuracion_bridge.libro;

import java.util.Scanner;  
public class FormAppletImpl implements FormularioImpl  
{  
  
  Scanner reader = new Scanner(System.in);  
  
  public void dibujaTexto(String texto)  
  {  
    System.out.println("Applet: " + texto);  
  }  
  
  public String administraZonaIndicada()  
  {  
    return reader.next();  
  }  
}