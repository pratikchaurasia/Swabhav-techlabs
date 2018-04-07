package com.techlabs.employee;

import java.util.Objects;

public class Employee {
	private int employeeId;
	private String name;
	private String role;
	private int managerId;
	private String date;
	private int salary;
	private int commission;
	private int deptId;
	
	public Employee(int employeeId, String name, String role, int managerId, String date,
			int salary, int commission, int deptId) {
		this.employeeId=employeeId;
		this.name=name;
		this.role=role;
		this.managerId=managerId;
		this.date=date;
		this.salary=salary;
		this.commission=commission;
		this.deptId=deptId;
	}
	public int getEmployeeId(){
		return employeeId;
	}
	
	public int getManagerId(){
		return managerId;
	}
	
	public int getSalary(){
		return salary;
	}
	public int getCommision(){
		return commission;
	}
	public String getEmployeeName(){
		return name;
	}
	public String getRole(){
		return role;
	}
	public int getDeptId(){
		return deptId;
	}

	
	public int calculateSalary(Employee employee,int salary,int commission){
		int annualSalary=(salary+commission)*12;
		return annualSalary;
	}
	@Override
	public boolean equals(Object obj){
		Employee emp=(Employee)obj;
		return this.getEmployeeId()==emp.employeeId;
	}
	
	@Override 
	public int hashCode(){
		return this.getEmployeeId();
	}
	
}
