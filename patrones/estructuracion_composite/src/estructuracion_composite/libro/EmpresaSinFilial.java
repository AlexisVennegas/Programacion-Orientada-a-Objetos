package estructuracion_composite.libro;

public class EmpresaSinFilial extends Empresa  
{  
    public boolean agregaFilial(Empresa filial)  
    {  
        return false;  
    }  
  
    public double calculaCosteMantenimiento()  
    {  
        return nVehiculos * costeUnitarioVehiculo;  
    }  
}
