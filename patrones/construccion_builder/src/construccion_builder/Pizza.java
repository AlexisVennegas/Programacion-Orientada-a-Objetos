package construccion_builder;

import java.util.ArrayList;
import java.util.List;

public class Pizza {

	private String masa;
	private List<String> ingredientes = new ArrayList<String>();
	private String salsa;
	
	
	public String getMasa() {
		return masa;
	}
	public void setMasa(String masa) {
		this.masa = masa;
	}
	
	
	public List<String> getIngredientes() {
		return ingredientes;
	}
	
	public void addIngrediente(String ingrediente){
		this.ingredientes.add(ingrediente);
	}
	
	public void setIngredientes(List<String> ingredientes) {
		this.ingredientes = ingredientes;
	}
	public String getSalsa() {
		return salsa;
	}
	public void setSalsa(String salsa) {
		this.salsa = salsa;
	}
	
	public String toString(){
		String descripcion = " MASA: "+ this.masa;
		descripcion += "\nINGREDIENTES:";
		for(String ingrediente:ingredientes){
			descripcion += "\nIngrediente:" + ingrediente;
		}
		descripcion += "\nSALSA:"+ this.salsa;
		return descripcion;
	}
	
}
