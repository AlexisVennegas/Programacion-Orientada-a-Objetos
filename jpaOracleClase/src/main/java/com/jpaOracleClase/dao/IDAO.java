package com.jpaOracleClase.dao;

import java.util.List;

import com.accesoDatos.dao.*;
import com.accesoDatos.data.Countries;

/**
 * Interfaz que provee  CRUD para BBDD
 * @author Erick
 *
 * @param <K>
 * @param <T>
 */
public interface IDAO<K,T> {
	
	List<T> findAll() throws DAOException;

	T findOne(K key) throws DAOException;

	void create(T item) throws DAOException;

	void update(T item) throws DAOException;

	//void delete(K key) throws DAOException;

	//Countries findOne(String country_id) throws DAOException;

	void delete(String key) throws DAOException;

}
