package contruccion_abstractFactory.example;

public class FabricaTipoMotorElectrico extends FabricaTipoMotor{

	public Coche construirCoche() {
		
		return new CocheElectrico();
	}

	public Moto construirMoto() {
		
		return new MotoElectrica();
	}

}
