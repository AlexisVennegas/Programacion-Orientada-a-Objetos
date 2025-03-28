package com.jpaOracleClase;

import com.jpaOracleClase.dao.DAOException;
import com.jpaOracleClase.dao.DepartamentoDAO;
import com.jpaOracleClase.dao.DepartamentoRepository;
import com.jpaOracleClase.data.Departamento;

public class TestDepartamento {

	public static void main(String[] args) throws DAOException {
//		DriverManagerOracle driverManager=DriverManagerOracle.getInstancia();
//		Connection con = driverManager.getConexion();
//		System.out.println(con);
		
		DepartamentoRepository dao = new DepartamentoDAO();
		  
		System.out.println("-------------- LISTADO DEPARTAMENTOS ----------------");
		for(Departamento departamento: dao.findAll()) {
			System.out.println(departamento);
		}
        System.out.println("-------------  DEPARTAMENTO ------------");
        Departamento departamento = dao.findOne(240);
        System.out.println(departamento);
        
        System.out.println("---------------- CREAR DEPARTAMENTO ---------");
        Departamento departamentoNuevo= new Departamento();
        departamentoNuevo.setId(290);
        departamentoNuevo.setNombre("MiDepartamento");
        departamentoNuevo.setIdGerente(108);
        departamentoNuevo.setIdDireccion(1700);
        
        dao.create(departamentoNuevo);
         departamento = dao.findOne(290);
        System.out.println(departamento);
        
        System.out.println("---------------- MODIFICAR DEPARTAMENTO ---------");
        departamento.setNombre("MiDepartamentoModificado");
        
        dao.update(departamento);
        departamento = dao.findOne(290);
        System.out.println(departamento);
        
        System.out.println("---------------- ELIMINAR DEPARTAMENTO ---------");
        dao.delete(280);
        for(Departamento departamentoAux: dao.findAll()) {
			System.out.println(departamentoAux);
		}
        		
	}

}
