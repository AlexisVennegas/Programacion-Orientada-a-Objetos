package contruccion_abstractFactory.example;

public class CocheGasolina extends Coche {

	public CocheGasolina(String  tipoMotor){
		super();
		this.tipoMotor=tipoMotor;
	}
	
	public CocheGasolina(){
		super();
		this.tipoMotor="COCHE GASOLINA";
	}
}
