package contruccion_abstractFactory.libro;

public class ScooterElectricidad extends Scooter  
{  
  public ScooterElectricidad(String modelo, String color,  
    int potencia)  
  {  
    super(modelo, color, potencia); 
  }  
  
  public void mostrarCaracteristicas()  
  {  
    System.out.println("Scooter electrica de modelo: " +  
      modelo + " de color: " + color +   
      " de potencia: " + potencia);  
  }  
  
}  
