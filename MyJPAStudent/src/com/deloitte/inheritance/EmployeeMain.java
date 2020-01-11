package com.deloitte.inheritance;

import java.util.Scanner;

import javax.persistence.EntityManager;

import com.deloitte.bean.JpaUtil;



public class EmployeeMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		EntityManager em = JpaUtil.getEntityManager();
		Employee1 emp = new Employee1();
		System.out.println("Enter Emp <Name> <Salary>");
		emp.setName(scan.next());
		emp.setSalary(scan.nextDouble());
		em.getTransaction().begin();
		em.persist(emp);
		Manager mgr = new Manager();
		System.out.println("Enter Mgr <Name> <Salary> <DeptName>");
		mgr.setName(scan.next());
		mgr.setSalary(scan.nextDouble());
		mgr.setDeptName(scan.next());
		em.persist(mgr);
		em.getTransaction().commit();
		System.out.println("Data saved in db");
		JpaUtil.closeEntityManager();

	}

}
