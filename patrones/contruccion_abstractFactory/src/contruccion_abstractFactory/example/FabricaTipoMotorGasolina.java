package contruccion_abstractFactory.example;

public class FabricaTipoMotorGasolina extends FabricaTipoMotor{

	public Coche construirCoche() {
		
		//return new CocheGasolina();
		return new CocheGasolina("COCHE GASOLINA");
	}

	public Moto construirMoto() {
		//return new MotoGasolina();
		return new MotoGasolina("MOTO GASOLINA");
	}

}
