package com.deloitte.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.deloitte.bean.Employee;

public class EmpMain {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("emp.xml");
		Employee emp = (Employee) ctx.getBean("emp");
		System.out.println(emp);
	}

}
