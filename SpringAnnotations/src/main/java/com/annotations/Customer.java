package com.annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Customer {

	

	int cid;
	String cname;
	public Customer() {
		System.out.println("MyBean instance created");
		// TODO Auto-generated constructor stub
	}
	@PostConstruct
	private void init() {
		System.out.println("verifying all resources");

	}
	@PreDestroy
	private void shutdown() {
		System.out.println("shutdown  all resources ");

	}
	
//	private void close() {
//		System.out.println("closing all resources");
//	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public Customer(int cid, String cname) {
		super();
		this.cid = cid;
		this.cname = cname;
	}
	

}
