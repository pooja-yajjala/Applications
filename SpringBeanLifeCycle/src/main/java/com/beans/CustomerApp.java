package com.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomerApp {

	public static void main(String[] args) {
		AbstractApplicationContext ac = new ClassPathXmlApplicationContext("customerbean.xml");
        Customer e = (Customer)ac.getBean("customer");
        System.out.println(e.toString());
        ac.registerShutdownHook();

	}

}
