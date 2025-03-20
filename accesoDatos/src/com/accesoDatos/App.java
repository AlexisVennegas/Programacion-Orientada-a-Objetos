package com.accesoDatos;

import com.accesoDatos.dao.DAOException;
import com.accesoDatos.dao.DepartamentoDAO;
import com.accesoDatos.dao.IDAO;
import com.accesoDatos.data.Departamento;

public class App {

	public static void main(String[] args) throws DAOException {
		// TODO Auto-generated method stub
		// SINGELTON
//		DriverManagerOracle driverManager = DriverManagerOracle.getInstancia();
//		// conexion
//		Connection con = driverManager.getConexion();
//		System.out.println(con);
		
		// idao = inferzas
		// departamentoDao clase concreta
		IDAO<Long, Departamento> dao = new DepartamentoDAO();
		
		//SCAR A TODOS LOS DEPARAMENTOS
		System.out.println("-------------- LISTADO DE PAISES ----------------");
		for(Departamento departamento : dao.findAll()) {
			System.out.println(departamento);
		}
		 System.out.println("-------------  UN UNICO PAIS------------");
	     //Departamento departamento = dao.findOne(12);
	     //System.out.println(departamento);
	}

}
