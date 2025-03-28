package com.jpaOracleClase;

import com.jpaOracleClase.dao.DAOException;
import com.jpaOracleClase.dao.DepartamentoDAO;
import com.jpaOracleClase.dao.IDAO;
import com.jpaOracleClase.data.Departamento;

public class testDepartamento {

		public static void main(String[] args) throws DAOException {
//			DriverManagerOracle driverManager=DriverManagerOracle.getInstancia();
//			Connection con = driverManager.getConexion();
//			System.out.println(con);
			
			IDAO<Integer,Departamento> dao = new DepartamentoDAO();
			  
			System.out.println("-------------- LISTADO DEPARTAMENTOS ----------------");
			for(Departamento departamento: dao.findAll()) {
				System.out.println(departamento);
			}
	        System.out.println("-------------  DEPARTAMENTO ------------");
	        Departamento departamento = dao.findOne(240);
	        System.out.println(departamento);
	        
	        System.out.println("---------------- CREAR DEPARTAMENTO ---------");
	        Departamento paisNuevo= new Departamento();
	        paisNuevo.setId(280);
	        paisNuevo.setNombre("MiDepartamento");
	        paisNuevo.setIdGerente(108);
	        paisNuevo.setIdDireccion(1700);
	        
	        dao.create(paisNuevo);
	         departamento = dao.findOne(280);
	        System.out.println(departamento);
	        
	        System.out.println("---------------- MODIFICAR DEPARTAMENTO ---------");
	        departamento.setNombre("MiDepartamentoModificado");
	        
	        dao.update(departamento);
	        departamento = dao.findOne(280);
	        System.out.println(departamento);
	        
	        System.out.println("---------------- ELIMINAR DEPARTAMENTO ---------");
	       // dao.delete(280);
	        for(Departamento paisAux: dao.findAll()) {
				System.out.println(paisAux);
			}
	        		
		}

	}


