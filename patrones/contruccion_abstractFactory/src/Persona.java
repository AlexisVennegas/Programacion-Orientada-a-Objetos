
public abstract class Persona {
	 private  Ojos ojos;
	 private Brazos brazos;
	 private Pelo pelo;	 

//	protected Persona(Ojos ojos, Brazos brazos, Pelo pelo) {
//			super();
//			this.ojos = ojos;
//			this.brazos = brazos;
//			this.pelo = pelo;
//		}
	
		
	public Ojos getOjos() {
		return ojos;
	}
	public void setOjos(Ojos ojos) {
		this.ojos = ojos;
	}
	public Brazos getBrazos() {
		return brazos;
	}
	public void setBrazos(Brazos brazos) {
		this.brazos = brazos;
	}
	public Pelo getPelo() {
		return pelo;
	}
	public void setPelo(Pelo pelo) {
		this.pelo = pelo;
	}
	 
	 

}
