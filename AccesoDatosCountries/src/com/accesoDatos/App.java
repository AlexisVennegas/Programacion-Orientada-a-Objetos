package com.accesoDatos;
import com.accesoDatos.dao.DAOException;
import com.accesoDatos.dao.IDAO;
import com.accesoDatos.dao.JobsDAO;
import com.accesoDatos.data.Countries;
import com.accesoDatos.data.Jobs;


public class App {
	public static void main(String[] args) throws DAOException {
		
		
		
		
		IDAO<String, Jobs> dao = new JobsDAO();
		
		System.out.println("-------------- LISTADO Jobs ----------------");
		
			for(Jobs job: dao.findAll()) {
				System.out.println(job);
			}
		
		 System.out.println("-------------  UN SOLO COUNTRY ------------");
	      
		  	Jobs job = dao.findOne("AC_ACCOUNT");
		  	System.out.println(job);
	      
		 System.out.println("---------------- CREAR COUNTRY ---------");
	      	
		 	Jobs jobNuevo= new Jobs();
		 	jobNuevo.setJobId("EXAMPLE5");
		 	jobNuevo.setJobTitle("EXAMPLE5");
		 	jobNuevo.setMinSalary(12);
		 	jobNuevo.setMaxSalary(1212);
	        
	        dao.create(jobNuevo);
	        System.out.println(jobNuevo);
		 
		 System.out.println("---------------- ELIMINAR un country ---------");
		 	dao.delete("EXAMPLE2");
	        for(Jobs jobsAux: dao.findAll()) {
				System.out.println(jobsAux);
			}
	        
	}
}
