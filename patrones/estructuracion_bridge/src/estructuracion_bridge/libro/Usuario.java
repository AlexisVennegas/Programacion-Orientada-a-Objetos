package estructuracion_bridge.libro;

public class Usuario  
{  
    public static void main(String[] args)  
    {  
        FormularioMatriculacionPortugal formulario1 = new  
          FormularioMatriculacionPortugal(new FormHtmlImpl());  
        formulario1.visualiza();  
        if (formulario1.administraZona())  
            formulario1.generaDocumento();  
        System.out.println();  
        FormularioMatriculacionEspaña formulario2 = new  
          FormularioMatriculacionEspaña(new FormAppletImpl());  
        formulario2.visualiza();  
        if (formulario2.administraZona())  
            formulario2.generaDocumento();  
    }  
}