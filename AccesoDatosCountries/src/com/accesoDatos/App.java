package com.accesoDatos;
import com.accesoDatos.dao.DAOException;
import com.accesoDatos.dao.ContriesDAO;
import com.accesoDatos.dao.IDAO;
import com.accesoDatos.data.Countries;

public class App {
	public static void main(String[] args) throws DAOException {
		
		
		
		
		IDAO<String, Countries> dao = new ContriesDAO();
		
		System.out.println("-------------- LISTADO COUNTRIES ----------------");
		
			for(Countries country: dao.findAll()) {
				System.out.println(country);
			}
		
		 System.out.println("-------------  UN SOLO COUNTRY ------------");
	      
		  	Countries departamento = dao.findOne("AR");
		  	System.out.println(departamento);
	      
		 System.out.println("---------------- CREAR COUNTRY ---------");
	      	
		 	Countries countryNuevo= new Countries();
	        countryNuevo.setCountry_id("EX");
	        countryNuevo.setName("examplePO");
	        countryNuevo.setRegionId(4);
	        
	        dao.create(countryNuevo);
	        System.out.println(countryNuevo);
		 
		 System.out.println("---------------- ELIMINAR un country ---------");
		 	dao.delete("PE");
	        for(Countries departamentoAux: dao.findAll()) {
				System.out.println(departamentoAux);
			}
	        
	}
}
