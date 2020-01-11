package com.deloitte;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class StudentDelete {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter <rollNo> of Student");
		int rollNo = scan.nextInt();
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("stud");
		EntityManager em = emf.createEntityManager();
		Student stud = em.find(Student.class, rollNo);
		if (stud != null) {
			System.out.println(stud);
			
			 // the object is DIRTY now
			em.getTransaction().begin();
			em.remove(stud); // changes are made into the table
			em.getTransaction().commit();
			System.out.println("Student deleted");
		} else {
			System.out.println("Stdent with roll no " + rollNo + " not found");
		}

	}
}