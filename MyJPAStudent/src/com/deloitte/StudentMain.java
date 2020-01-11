package com.deloitte;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class StudentMain {
	
	public StudentMain() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter <Name><Subject>");
		Student stud = new Student(scan.next(), scan.next());
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("stud");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(stud);
		em.getTransaction().commit();
		System.out.println("Student saved");
	}

	public static void main(String[] args) {
		new StudentMain();
	}
}
