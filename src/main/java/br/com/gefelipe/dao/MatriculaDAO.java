
package br.com.gefelipe.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


import br.com.gefelipe.domain.Matricula;


public class MatriculaDAO implements IMatriculaDao {


	
	public Matricula cadastrar(Matricula mat) {
		
		EntityManagerFactory entityManagerFactory = 
				Persistence.createEntityManagerFactory("ExemploJPA");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		entityManager.getTransaction().begin();
		entityManager.persist(mat);
		entityManager.getTransaction().commit();
		 
		entityManager.close();
		entityManagerFactory.close();
		return mat;
	}



}