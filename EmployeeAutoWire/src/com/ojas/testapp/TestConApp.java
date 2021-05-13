package com.ojas.testapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.constructormode.Employee;

public class TestConApp {

	public static void main(String[] args) {
				ApplicationContext context = new ClassPathXmlApplicationContext("beansconst.xml");
				Employee employee = (Employee)context.getBean("empid");
				System.out.println(employee.toString());

	}

}
