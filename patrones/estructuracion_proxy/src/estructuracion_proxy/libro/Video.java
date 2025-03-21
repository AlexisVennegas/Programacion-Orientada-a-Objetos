package estructuracion_proxy.libro;

public class Video implements Animacion  
{  
    public void clic() { }  
  
    public void dibuja()  
    {  
        System.out.println("Mostrar el vídeo");  
    }  
  
    public void carga()  
    {  
        System.out.println("Cargar el vídeo");  
    }  
  
    public void reproduce()  
    {  
        System.out.println("Reproducir el vídeo");  
    }  
}
