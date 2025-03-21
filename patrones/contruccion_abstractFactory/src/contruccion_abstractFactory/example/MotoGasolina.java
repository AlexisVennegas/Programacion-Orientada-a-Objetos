package contruccion_abstractFactory.example;

public class MotoGasolina extends Moto {
	
	public MotoGasolina(String  tipoMotor){
		super();
		this.tipoMotor=tipoMotor;
	}
	

	
	public MotoGasolina(){
		super();
		this.tipoMotor="MOTO GASOLINA";
	}

}
