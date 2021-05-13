package com.ojas.testapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ojas.autowiring.Employee;

public class TestApplication {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beanauto.xml");
		Employee employee = (Employee)context.getBean("employeeid");
		System.out.println(employee.toString());

	}

}
