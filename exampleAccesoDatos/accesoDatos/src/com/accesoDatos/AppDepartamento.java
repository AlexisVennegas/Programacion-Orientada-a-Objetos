package com.accesoDatos;

import com.accesoDatos.dao.DAOException;
import com.accesoDatos.dao.DepartamentoDAO;
import com.accesoDatos.dao.IDAO;
import com.accesoDatos.data.Departamento;

public class AppDepartamento {

	public static void main(String[] args) throws DAOException {
//		DriverManagerOracle driverManager=DriverManagerOracle.getInstancia();
//		Connection con = driverManager.getConexion();
//		System.out.println(con);
		
		IDAO<Long,Departamento> dao = new DepartamentoDAO();
		  
		System.out.println("-------------- LISTADO DEPARTAMENTOS ----------------");
		for(Departamento departamento: dao.findAll()) {
			System.out.println(departamento);
		}
        System.out.println("-------------  DEPARTAMENTO ------------");
        Departamento departamento = dao.findOne(240l);
        System.out.println(departamento);
        
        System.out.println("---------------- CREAR DEPARTAMENTO ---------");
        Departamento departamentoNuevo= new Departamento();
        departamentoNuevo.setId(280l);
        departamentoNuevo.setNombre("MiDepartamento");
        departamentoNuevo.setIdManager(108);
        departamentoNuevo.setIdDireccion(1700l);
        
        dao.create(departamentoNuevo);
         departamento = dao.findOne(280l);
        System.out.println(departamento);
        
        System.out.println("---------------- MODIFICAR DEPARTAMENTO ---------");
        departamento.setNombre("MiDepartamentoModificado");
        
        dao.update(departamento);
        departamento = dao.findOne(280l);
        System.out.println(departamento);
        
        System.out.println("---------------- ELIMINAR DEPARTAMENTO ---------");
        dao.delete(280l);
        for(Departamento departamentoAux: dao.findAll()) {
			System.out.println(departamentoAux);
		}
        		
	}

}
