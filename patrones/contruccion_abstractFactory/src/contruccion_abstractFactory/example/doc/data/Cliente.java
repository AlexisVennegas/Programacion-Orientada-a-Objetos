package contruccion_abstractFactory.example.doc.data;

public class Cliente {
	
	private int numSocio;

	
	public int getNumSocio() {
		if(numSocio == 0) numSocio=123;
		return numSocio;
	}

	public void setNumSocio(int numSocio) {
		this.numSocio = numSocio;
	}
	
	

}
