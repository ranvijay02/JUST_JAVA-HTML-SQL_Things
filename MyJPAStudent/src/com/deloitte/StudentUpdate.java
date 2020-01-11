package com.deloitte;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class StudentUpdate {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter <rollNo> of Student");
		int rollNo = scan.nextInt();
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("stud");
		EntityManager em = emf.createEntityManager();
		Student stud = em.find(Student.class, rollNo);
		if (stud != null) {
			System.out.println(stud);
			System.out.println("Enter the new Subject ");
			String subject = scan.next();
			stud.setSubject(subject); // the object is DIRTY now
			em.getTransaction().begin();
			em.merge(stud); // changes are made into the table
			em.getTransaction().commit();
			System.out.println("Student updated");
		} else {
			System.out.println("Stdent with roll no " + rollNo + " not found");
		}

	}
}