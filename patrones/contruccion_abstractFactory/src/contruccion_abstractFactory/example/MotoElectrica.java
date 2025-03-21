package contruccion_abstractFactory.example;

public class MotoElectrica extends Moto {
	
	public MotoElectrica(String  tipoMotor){
		super();
		this.tipoMotor=tipoMotor;
	}
	
	public MotoElectrica(){
		super();
		this.tipoMotor="MOTO ELECTRICO";
	}

}
