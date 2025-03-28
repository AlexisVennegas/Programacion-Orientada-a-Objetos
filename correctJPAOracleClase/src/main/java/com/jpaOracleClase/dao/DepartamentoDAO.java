package com.jpaOracleClase.dao;

import java.util.List;

import com.jpaOracleClase.data.Departamento;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.transaction.Transactional;

public class DepartamentoDAO implements DepartamentoRepository {
    
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("pepe");
	EntityManager em;
	
	@Override
	public List<Departamento> findAll() throws DAOException {
		em=emf.createEntityManager();
		List<Departamento> departamentos=em.createQuery("select d from Departamento d", Departamento.class)
											.getResultList();
		
		em.close();
		return departamentos;
	}

	@Override
	public Departamento findOne(Integer id) throws DAOException {
		em=emf.createEntityManager();
		Departamento departamento = em.find(Departamento.class, id);
		em.close();
		return departamento;
	}

	@Override
	@Transactional
	public void create(Departamento departamento) throws DAOException {
		em=emf.createEntityManager();
		em.getTransaction().begin();
			em.persist(departamento);//inserta en la bbdd
		em.getTransaction().commit();		
		em.close();
	}

	@Override
	@Transactional
	public void update(Departamento departamento) throws DAOException {
		em=emf.createEntityManager();	
		em.getTransaction().begin();
			em.merge(departamento);
		em.getTransaction().commit();
		em.close();
	}

	@Override
	@Transactional
	public void delete(Integer id) throws DAOException {
		em=emf.createEntityManager();
		Departamento departamento = em.find(Departamento.class, id);
		em.getTransaction().begin();
			em.remove(departamento);//delete de la bbdd
		em.getTransaction().commit();
		em.close();
	}

}
