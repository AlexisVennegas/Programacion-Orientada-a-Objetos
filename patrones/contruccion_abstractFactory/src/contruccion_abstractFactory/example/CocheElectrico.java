package contruccion_abstractFactory.example;

public class CocheElectrico extends Coche{

	public CocheElectrico(String  tipoMotor){
		super();
		this.tipoMotor=tipoMotor;
	}
	
	public CocheElectrico(){
		super();
		this.tipoMotor="COCHE ELECTRICO";
	}
	
	
}
