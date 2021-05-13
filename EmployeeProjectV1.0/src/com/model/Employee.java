package com.model;

public class Employee {
	private int id;
	private String name;
	double salary;
	double commission;
	double totalsalary;
	Department dept;
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	public double getTotalsalary() {
		return totalsalary;
	}
	public void setTotalsalary(double totalsalary) {
		this.totalsalary = totalsalary;
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getCommission() {
		return commission;
	}
	public void setCommission(double commission) {
		this.commission = commission;
	}
	public double display() {
		return totalsalary = salary+commission;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", commission=" + commission + ", dept="
				+ dept + ", getDept()=" + getDept() + ", getTotalsalary()=" + getTotalsalary() + ", getId()=" + getId()
				+ ", getName()=" + getName() + ", getSalary()=" + getSalary() + ", getCommission()=" + getCommission()
				+ ", display()=" + display() + "]";
	}
	
	
	
	
	
	
}
