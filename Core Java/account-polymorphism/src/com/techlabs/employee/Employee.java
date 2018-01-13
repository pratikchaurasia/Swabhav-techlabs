package com.techlabs.employee;

public abstract class Employee {
	private int empNo;
	private String name;
	protected double basic;
	
	public Employee(int empNo,String name,double basic){
		this.empNo=empNo;
		this.name=name;
		this.basic=basic;
	}
	public abstract double calculateNetSalary();

}
