package com.techlabs.employee;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	private int employeeId;
	private String name;
	private String role;
	private String managerId;
	private String date;
	private int salary;
	private String commission;
	private String deptId;
	private ArrayList<Employee> reportees;

	public Employee(int employeeId, String name, String role, String managerId,
			String date, int salary, String commission, String deptId) {
		this.employeeId = employeeId;
		this.name = name;
		this.role = role;
		this.managerId = managerId;
		this.date = date;
		this.salary = salary;
		this.commission = commission;
		this.deptId = deptId;
		this.reportees = new ArrayList<Employee>();
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public String getManagerId() {
		return managerId;
	}

	public int getSalary() {
		return salary;
	}

	public String getCommision() {
		return commission;
	}

	public String getEmployeeName() {
		return name;
	}

	public String getRole() {
		return role;
	}

	public String getDeptId() {
		return deptId;
	}

	public ArrayList<Employee> getReportees() {
		return reportees;
	}

	public void addReportee(Employee employee) {
		this.reportees.add(employee);
	}
	public void isEmpty(){
		if(reportees.isEmpty()){
			System.out.println("Empty");
		}
		else{
		System.out.println("not empty");
		}
	}

	@Override
	public boolean equals(Object obj) {
		Employee emp = (Employee) obj;
		return this.getEmployeeId() == emp.employeeId;
	}

	@Override
	public int hashCode() {
		return this.getEmployeeId();
	}

}
