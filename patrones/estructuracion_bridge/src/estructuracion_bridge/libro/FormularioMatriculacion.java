package estructuracion_bridge.libro;

public abstract class FormularioMatriculacion  
{  
    protected String contenido;  
    protected FormularioImpl implementacion;  
  
    public FormularioMatriculacion(FormularioImpl  
      implementacion)  
    {  
        this.implementacion = implementacion;  
    }  
  
    public void visualiza()  
    {  
        implementacion.dibujaTexto(  
        "número de matrícula existente: ");  
    }  
  
    public void generaDocumento()  
    {  
        implementacion.dibujaTexto("Solicitud de matriculación");  
        implementacion.dibujaTexto("número de matrícula: " +  
        contenido);  
    }  
  
    public boolean administraZona()  
    {  
        contenido = implementacion.administraZonaIndicada();  
        return this.controlZona(contenido);  
    }  
  
    protected abstract boolean controlZona(String matricula);  
}