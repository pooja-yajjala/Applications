package com.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class MyConfiguration {
	@Bean
	@Scope(value="singleton")//only one bean instance will be created
	public Customer createCustomer() {
		return new Customer();
		
	}
}
