package com.techlabs.builder;

import java.util.List;

import com.techlabs.employee.Employee;

public class EmployeeDTO {
	private String  employeeId;
	private String name;
	private String role;
	private String managerId;
	private String date;
	private String salary;
	private String commission;
	private String deptId;
	private List<EmployeeDTO> employeeList;
	
	public EmployeeDTO(String employeeID,String name, String role,String managerId,String date, String salary,String commision,String deptId){
		this.employeeId=employeeID;
		this.name=name;
		this.role=role;
		this.managerId=managerId;
		this.date=date;
		this.salary=salary;
		this.commission=commision;
		this.deptId=deptId;
	}
	public String getEmployeeId() {
		return employeeId;
	}

	public String getManagerId() {
		return managerId;
	}

	public String getSalary() {
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
	public String getDate() {
		return date;
	}
	public List<EmployeeDTO> getEmployeeList() {
		return employeeList;
	}

}
