package com.deloitte.bean;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaUtil {

	private static EntityManager em;

	public static EntityManager getEntityManager() {
		if (em == null || !em.isOpen()) {
			EntityManagerFactory emf = 
					Persistence.createEntityManagerFactory("stud");
			em = emf.createEntityManager();
		}
		return em;
	}
	public static void closeEntityManager() {
		if(em!=null) {
			em.close();
		}		
	}

}
