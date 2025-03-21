package estructuracion_facade.libro;

import java.util.*;  
public class UsuarioWebService  
{  
  public static void main(String[] args)  
  {  
    WebServiceAuto webServiceAuto = new  
      WebServiceAutoImpl();  
    System.out.println(webServiceAuto.documento(0));  
    System.out.println(webServiceAuto.documento(1));  
    List<String> resultados =  
      webServiceAuto.buscaVehiculos(6000, 1000);  
    if (resultados.size() > 0)  
    {  
      System.out.println(  
        "Vehículo(s) cuyo precio está comprendido "+  
        "entre 5000 y 7000");  
      for (String resultado: resultados)  
        System.out.println("   " + resultado);  
    }  
  }  
}
