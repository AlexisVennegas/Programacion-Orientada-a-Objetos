package com.accesoDatos.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.accesoDatos.data.Jobs;
import org.apache.log4j.Logger;

public class JobsDAO implements IDAO<String, Jobs>{
	DriverManagerOracle driverManager;
	
	private static final Logger Log = Logger.getLogger(JobsDAO.class);
	
	public JobsDAO() {
		this.driverManager = DriverManagerOracle.getInstancia();
	}
	public Connection getConnection() {
		return DriverManagerOracle.getInstancia().getConexion();
	}
	
	@Override
	public void update(Jobs jobs) throws DAOException {
		Connection con;
		PreparedStatement pstm;
		
		String sql = "UPDATE FROM JOBS SET JOB_ID =?, JOB_TITLE=?, MIN_SALARY=?, MAX_SALARY=? WHERE JOB_ID = ?";
		
		try {
			con = driverManager.getConexion();
			pstm = con.prepareStatement(sql);
			pstm.setString(0, jobs.getJobId());
			pstm.setString(1, jobs.getJobTitle());
			pstm.setInt(2, jobs.getMinSalary());
			pstm.setInt(3, jobs.getMaxSalary());
			
			int rowAffect = pstm.executeUpdate();
			
			if(rowAffect == 0) {
				throw new DAOException(TipoException.ELEMENTO_NO_ACTUALIZADO);
			} else if (rowAffect > 1) {
				Log.error(TipoException.ELEMENTO_DUPLICADO.getMensaje());
				throw new DAOException(TipoException.ELEMENTO_DUPLICADO);
			}
			pstm.close();
			con.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	@Override
	public void delete(String jobs_id) throws DAOException {
		Connection con;
		PreparedStatement pstm;
		
		String sql = "DELETE FROM JOBS SET JOB_ID=?, JOT";
		
		con = driverManager.getConexion();
		try {
			pstm = con.prepareStatement(sql);
			pstm.setString(1, jobs_id);
			int rowAffect = pstm.executeUpdate();
			if(rowAffect == 1) {
				System.out.println("Elemento creado");
			} else {
				throw new DAOException(TipoException.ELEMENTO_NO_CREADO);
			}
			
			
			
		} catch (SQLException sqle) {
			throw new DAOException(TipoException.EXCEPCION_SQL);
		}
	}
	
	@Override
	public void create(Jobs jobsItem) throws DAOException {
		
		
		Connection con;
		PreparedStatement pstm;
		String sql = "INSERT INTO JOBS (JOB_ID, JOB_TITLE, MIN_SALARY, MAX_SALARY) VALUES(?, ?, ?, ?)";
		
		try {
			con = driverManager.getConexion();
			pstm = con.prepareStatement(sql);
			
			pstm.setString(1, jobsItem.getJobId());
			pstm.setString(2, jobsItem.getJobTitle());
			pstm.setInt(3, jobsItem.getMinSalary());
			pstm.setInt(4, jobsItem.getMaxSalary());
			
			int rowAffect = pstm.executeUpdate();
			
			if(rowAffect == 1) {
				System.out.println("Elemento creado");
			} else {
				throw new DAOException(TipoException.ELEMENTO_NO_CREADO);
			}
			
		} catch (SQLException sqle) {
			Log.error(sqle.getMessage(), sqle);
			throw new DAOException(TipoException.EXCEPCION_SQL);
		}
		
	}
	
	
	
	@Override
	public Jobs findOne(String jobId) throws DAOException {
		
		// variables de conexion
		Connection con;
		PreparedStatement pstm;
		ResultSet rs;
		
		Jobs jobsExample = null;
		
		String sql = "SELECT JOB_ID, JOB_TITLE, MIN_SALARY, MAX_SALARY FROM JOBS WHERE JOB_ID = ?";
		try {
			con = driverManager.getConexion();
			pstm = con.prepareStatement(sql);
			pstm.setString(1, jobId);
			rs = pstm.executeQuery();
			
			if(rs.next()) {
				jobsExample = new Jobs();
				
				jobsExample.setJobId(rs.getString("JOB_ID"));
				jobsExample.setJobTitle(rs.getString("JOB_TITLE"));
				jobsExample.setMaxSalary(rs.getInt("MAX_SALARY"));
				jobsExample.setMinSalary(rs.getInt("MIN_SALARY"));
			} else throw new DAOException(TipoException.ELEMENTO_NO_ENCONTRADO);
			if (rs.next()) {
				Log.fatal(TipoException.ELEMENTO_DUPLICADO.getMensaje());
				throw new DAOException(TipoException.ELEMENTO_DUPLICADO);
			}
			rs.close();
			pstm.close();
			con.close();
		
			
		} catch(SQLException sqle) {
			throw new DAOException(TipoException.EXCEPCION_SQL);
		}
		return jobsExample;
	}
	
	
	// metodo para sacar todos la informacion
	@Override
	public List<Jobs> findAll() throws DAOException {
		// LOG INFO 
		Log.debug("FindAll");
		
		// VARIABLES
		
		// PRIMERL A VARIABLE CON LA QUE HAREMOS LA CONEXION
		Connection con;
		// ESTADO PARA EJECUTAR QUERYS DE SQL
		Statement stm;
		// REUSLTADO DE LA CONSULTA
		ResultSet rs;
		
		// AQUI CREAMOS LA LISTA QUE VAMOS A DEVOLVER POR AHORA VACIA
		List<Jobs> jobs = new ArrayList<Jobs>();
		
		// QUERY
		String sql = "SELECT JOB_ID, JOB_TITLE, MIN_SALARY, MAX_SALARY FROM JOBS";
		try {
			con = driverManager.getConexion();
			stm = con.createStatement();
			rs = stm.executeQuery(sql);
			
			while(rs.next()) {
				Jobs jobsExample = new Jobs();
				jobsExample.setJobId(rs.getString("JOB_ID"));
				jobsExample.setJobTitle(rs.getString("JOB_TITLE"));
				jobsExample.setMaxSalary(rs.getInt("MAX_SALARY"));
				jobsExample.setMinSalary(rs.getInt("MIN_SALARY"));
				
				jobs.add(jobsExample);
			}
			
			return jobs;
		} catch(SQLException sqle) { {
			Log.error(sqle.getMessage(), sqle);
			throw new DAOException(TipoException.EXCEPCION_SQL);
		} 
		}
	}
}
