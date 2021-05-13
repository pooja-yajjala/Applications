package com.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CustomerApplication {
	public static void main(String[] args) {
		
	
	AnnotationConfigApplicationContext c = new AnnotationConfigApplicationContext();
	c.register(MyConfiguration.class);
	c.refresh();
	Customer c1 = c.getBean(Customer.class);
	System.out.println(c1.hashCode());
	
//	System.out.println(c1.getCid());
	
	c1.setCid(20282);
	System.out.println(c1.getCid());
	c1.setCname("Pooja Yajjala");
	System.out.println(c1.getCname());
	
	c.close();
	
	
	
	
}
}