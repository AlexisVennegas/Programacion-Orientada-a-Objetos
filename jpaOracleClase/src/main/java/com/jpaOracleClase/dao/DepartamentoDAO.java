package com.jpaOracleClase.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.jpaOracleClase.data.Departamento;



public class DepartamentoDAO implements IDAO<Integer, Departamento> {


	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("pepe");
	EntityManager em;
	
	
	@Override
	public List<Departamento> findAll() throws DAOException {
		// TODO Auto-generated method stub
		em = emf.createEntityManager();
		List<Departamento> departamentos = em.createQuery("SELECT D FROM D", Departamento.class)
											 .getResultList();
		
		emf.close();
		return departamentos;
	}

	@Override
	public Departamento findOne(Integer id) throws DAOException {
		em = emf.createEntityManager();
		// TODO Auto-generated method stub
		Departamento departamento = em.find(Departamento.class, id);
		
		
		emf.close();
		return departamento;
	}

	@Override
	public void create(Departamento departamento) throws DAOException {
		// TODO Auto-generated method stub
		em = emf.createEntityManager();
		// TODO Auto-generated method stub
		em.merge(departamento);
		//if(!departamento) return;
		em.persist(departamento);
		Departamento departamentoPersistido = em.find(Departamento.class, departamento.getId());
		
		emf.close();
		
	}

	@Override
	public void update(Departamento item) throws DAOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(String id) throws DAOException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		em = emf.createEntityManager();
		Departamento dep = em.find(Departamento.class, id);
		em.remove(dep);
		
		emf.close();
		
	}



}
