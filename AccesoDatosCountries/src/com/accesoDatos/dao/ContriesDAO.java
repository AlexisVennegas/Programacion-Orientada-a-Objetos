package com.accesoDatos.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.accesoDatos.data.Countries;
import org.apache.log4j.Logger;

public class ContriesDAO implements IDAO<String, Countries> {

	DriverManagerOracle driverManager;

	private static final Logger log = Logger.getLogger(ContriesDAO.class);

	public ContriesDAO() {

		this.driverManager = DriverManagerOracle.getInstancia();
	}

	public Connection getConection() {
		return DriverManagerOracle.getInstancia().getConexion();
	}

	@Override
	public List<Countries> findAll() throws DAOException {
		log.debug("findAll");

		Connection con;
		Statement stm;
		ResultSet rs;

		List<Countries> countries = new ArrayList<Countries>();

	//	String sql = "SELECT DEPARTMENT_ID,DEPARTMENT_NAME,LOCATION_ID,MANAGER_ID FROM DEPARTMENTS ORDER BY DEPARTMENT_ID";
		String sql = "SELECT COUNTRY_ID, COUNTRY_NAME, REGION_ID FROM COUNTRIES";
		
		try {
			con = driverManager.getConexion();
			stm = con.createStatement();
			rs = stm.executeQuery(sql);

			while (rs.next()) {
				Countries country = new Countries();
				country.setCountry_id(rs.getString("COUNTRY_ID"));
				country.setName(rs.getString("COUNTRY_NAME"));
				country.setRegionId(rs.getInt("REGION_ID"));
				//departamento.setId(rs.getLong("DEPARTMENT_ID"));
				//departamento.setNombre(rs.getString("DEPARTMENT_NAME"));
				// departamento.setIdDireccion(rs.getLong("LOCATION_ID"));
				// departamento.setIdManager(rs.getInt("MANAGER_ID"));
				// departamentos.add(departamento);
				countries.add(country);
			}

			return countries;

		} catch (SQLException sqle) {
			log.error(sqle.getMessage(), sqle);
			throw new DAOException(TipoException.EXCEPCION_SQL);

		} catch (Exception e) {
			log.error(e.getMessage(), e);
			throw new DAOException(TipoException.EXCEPCION_GENERAL);
		}

	}

	@Override
	public Countries findOne(String country_id) throws DAOException {
		 log.debug("findOne");
		 log.info("id: "+ country_id);

		Connection con;
		PreparedStatement pstm;
		ResultSet rs;

		Countries country  = null;

		//String sql = "SELECT DEPARTMENT_ID, DEPARTMENT_NAME, MANAGER_ID, LOCATION_ID FROM DEPARTMENTS WHERE DEPARTMENT_ID =?";
		String sql = "SELECT COUNTRY_ID, COUNTRY_NAME, REGION_ID FROM COUNTRIES WHERE COUNTRY_ID = ?";
		// log.info(sql);
		try {
//			Object i = 42;
//			String s = (String) i;

			con = driverManager.getConexion();
			pstm = con.prepareStatement(sql);
			pstm.setString(1, country_id);
			rs = pstm.executeQuery();

			if (rs.next()) {
				country  = new Countries();
				//country.setStr(rs.getLong("COUNTRY_ID"));
				country.setCountry_id(rs.getString("COUNTRY_ID"));
				country.setName(rs.getString("COUNTRY_NAME"));
				country.setRegionId(rs.getInt("REGION_ID"));
			} else {
				// log.error(TipoException.ELEMENTO_NO_ENCONTRADO.getMensaje());
				throw new DAOException(TipoException.ELEMENTO_NO_ENCONTRADO);
			}
			if (rs.next()) {
				log.fatal(TipoException.ELEMENTO_DUPLICADO.getMensaje());
				throw new DAOException(TipoException.ELEMENTO_DUPLICADO);
			}
			rs.close();
			pstm.close();
			con.close();

		} catch (SQLException sqle) {
			// log.error(sqle.getMessage(),sqle);
			throw new DAOException(TipoException.EXCEPCION_SQL);

		} catch (DAOException daoe) {
			// System.out.println("Nuestro objeto excepcion:"+daoe);
			throw daoe;

		} catch (ClassCastException e) {
			System.out.println("Se ha producido un error de conversion de tipos");
			throw new DAOException(TipoException.EXCEPCION_GENERAL);
		} catch (Exception e) {
			// log.error(e.getMessage(),e);
			throw new DAOException(TipoException.EXCEPCION_GENERAL);
		}
		return country;
	}

	@Override
	public void create(Countries item) throws DAOException {
		// TODO Auto-generated method stub
		log.debug("Create");

		Connection con;
		PreparedStatement pstm;

		String sql = "INSERT INTO COUNTRIES (COUNTRY_ID,COUNTRY_NAME,REGION_ID) VALUES(?,?,?)";

		try {
			con = driverManager.getConexion();
			pstm = con.prepareStatement(sql);
//			pstm.setLong(1, item.getId());
//			pstm.setString(2, item.getNombre());
//			pstm.setLong(3, item.getIdDireccion());
//			pstm.setInt(4, item.getIdManager());
			
			pstm.setString(1, item.getCountry_id());
			pstm.setString(2, item.getName());
			pstm.setLong(3, item.getRegionId());

			int i = pstm.executeUpdate();

			if (i == 1) {
				log.info("Elemento creado:");
			} else {
				log.error(TipoException.ELEMENTO_NO_CREADO.getMensaje());
				throw new DAOException(TipoException.ELEMENTO_NO_CREADO);
			}

			pstm.close();
			con.close();

		} catch (SQLException sqle) {
			log.error(sqle.getMessage(), sqle);
			throw new DAOException(TipoException.EXCEPCION_SQL);

		} catch (DAOException daoe) {
			log.error(daoe.getMessage(), daoe);
			throw new DAOException(daoe.getTipoExcepcion());
		} catch (Exception e) {
			log.error(e.getMessage(), e);
			throw new DAOException(TipoException.EXCEPCION_GENERAL);
		}

	}

	@Override
	public void update(Countries item) throws DAOException {
		log.debug("update");

		Connection con;
		PreparedStatement pstm;

		String sql = "UPDATE COUNTRIES SET COUNTRY_ID=?, COUNTRY_NAME=?, REGION_ID=? WHERE COUNTRY_ID=?";

		try {
			con = driverManager.getConexion();
			pstm = con.prepareStatement(sql);
			pstm.setString(1, item.getCountry_id());
			pstm.setString(2, item.getName());
			pstm.setLong(3, item.getRegionId());
			
			int i = pstm.executeUpdate();

			if (i == 0) {
				log.error(TipoException.ELEMENTO_NO_ACTUALIZADO.getMensaje());
				throw new DAOException(TipoException.ELEMENTO_NO_ACTUALIZADO);
			} else if (i > 1) {
				log.error(TipoException.ELEMENTO_DUPLICADO.getMensaje());
				throw new DAOException(TipoException.ELEMENTO_DUPLICADO);
			}

			pstm.close();
			con.close();

		} catch (SQLException sqle) {
			log.error(sqle.getMessage(), sqle);
			throw new DAOException(TipoException.EXCEPCION_SQL);

		} catch (DAOException daoe) {
			throw daoe;

		} catch (Exception e) {
			log.error(e.getMessage(), e);
			throw new DAOException(TipoException.EXCEPCION_GENERAL);
		}

	}

	@Override
	public void delete(String key) throws DAOException {
		log.debug("delete");

		Connection con;
		PreparedStatement pstm;

		String sql = "DELETE FROM Countries WHERE COUNTRY_ID=?";

		con = driverManager.getConexion();

		try {
			pstm = con.prepareStatement(sql);
			pstm.setString(1, key);
			int i = pstm.executeUpdate();

			if (i == 0) {
				log.error(TipoException.ELEMENTO_NO_ELIMINADO.getMensaje());
				throw new DAOException(TipoException.ELEMENTO_NO_ELIMINADO);
			} else if (i > 1) {
				log.error(TipoException.ELEMENTO_DUPLICADO.getMensaje());
				con.rollback();
				throw new DAOException(TipoException.ELEMENTO_DUPLICADO);
			}
			pstm.close();
			con.close();

		} catch (SQLException sqle) {
			log.error(sqle.getMessage(), sqle);
			throw new DAOException(TipoException.EXCEPCION_SQL);

		} catch (DAOException daoe) {
			throw daoe;

		} catch (Exception e) {
			log.error(e.getMessage(), e);
			throw new DAOException(TipoException.EXCEPCION_GENERAL);
		}

	}

	

}
