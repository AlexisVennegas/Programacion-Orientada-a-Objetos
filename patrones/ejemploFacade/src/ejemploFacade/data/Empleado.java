package ejemploFacade.data;

import java.io.Serializable;

public class Empleado implements Serializable{
	
	private int id;
	
	

	public Empleado() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	

}
