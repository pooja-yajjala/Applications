package com.autowiring;

public class Employee {
	private int id;
	private String name;
Department dept;
	public Department getDept() {
	return dept;
}
public void setDept(Department dept) {
	this.dept = dept;
}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + "]";
	}
	
	
	
}
