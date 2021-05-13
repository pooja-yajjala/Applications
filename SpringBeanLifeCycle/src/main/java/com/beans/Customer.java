package com.beans;

import java.util.*;

public class Customer {
	int cid;
	String cname;
	Calendar cal = Calendar. getInstance(); 
    Date d=cal. getTime();
	
	private void init() {
		System.out.println("inside init()");
	}
	
	private void destroy() {
		System.out.println("inside destroy()");

	}

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(int cid, String cname, Date d) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.d = d;
	}
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
	public Date getD() {
		return d;
	}
	public void setD(Date d) {
		this.d = d;
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", d=" + d + "]";
	}

	
	

}
