package com.testapplication;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Employee;





public class EMPApplication {
 
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		Employee employee = (Employee)context.getBean("employeeid");
		System.out.println(employee.toString());

		
	}
}
