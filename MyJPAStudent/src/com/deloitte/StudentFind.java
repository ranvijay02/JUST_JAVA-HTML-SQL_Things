package com.deloitte;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class StudentFind {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter <rollNo> of student");
	int rollNo = scan.nextInt();
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("stud");
	EntityManager em = emf.createEntityManager();
	
	Student stud = em.find(Student.class, rollNo);
	if(stud!=null)
		System.out.println(stud);
	else
		System.out.println("student with rollNo " +rollNo + " not found");
}
}
