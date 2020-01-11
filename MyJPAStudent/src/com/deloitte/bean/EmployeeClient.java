package com.deloitte.bean;

import java.util.Scanner;

import javax.persistence.EntityManager;

public class EmployeeClient {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		EntityManager em = JpaUtil.getEntityManager();		
		System.out.println("Enter dept <name> ");
		Department dept = new Department();
		dept.setName(scan.next());		
		System.out.println("Enter emp <name> <salary> ");
		Employee emp = new Employee();
		emp.setName(scan.next());
		emp.setSalary(scan.nextDouble());
		dept.addEmployee(emp);
		System.out.println("Enter emp <name> <salary> ");
		emp = new Employee();
		emp.setName(scan.next());
		emp.setSalary(scan.nextDouble());
		dept.addEmployee(emp);
		em.getTransaction().begin();
		em.persist(dept);
		em.getTransaction().commit();
		System.out.println("data saved");
		JpaUtil.closeEntityManager(); 
		
	}

}
