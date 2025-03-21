package estructuracion_decorator.libro;

public class ModeloDecorador extends Decorador  
{  
    public ModeloDecorador(ComponenteGraficoVehiculo  
    componente)  
    { 
      super(componente); 
    }  
  
    protected void visualizaInformacionTecnica()  
    {  
        System.out.println("Información técnica del modelo");  
    }  
  
    public void visualiza()  
    {  
        super.visualiza();  
        this.visualizaInformacionTecnica();  
    }  
}
