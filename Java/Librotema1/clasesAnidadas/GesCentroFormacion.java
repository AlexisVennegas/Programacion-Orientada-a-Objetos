package clasesAnidadas;

import java.util.*;


public class GesCentroFormacion {

	
	public List<CentroFormacion> listCentrosFormacion()  {
		return new ArrayList <CentroFormacion>();
	}
	
	@SuppressWarnings("serial")
	public static class BusinessException extends Exception {
		
		public void init() {
			System.out.println("hola");
		}
		
		
	}
}
