package com.techlabs.department;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.techlabs.employee.Employee;

@Entity
public class Department {
	@Id
	@GeneratedValue
	@Column(name = "id", unique = true)
	private int id;
	private String name;
	
	@OneToMany(mappedBy = "dept", cascade = CascadeType.ALL)
	private Set<Employee> employee = new HashSet<Employee>();
	
	public Set<Employee> getEmployee() {
		return employee;
	}
	public void setEmployee(Set<Employee> employee) {
		this.employee = employee;
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
	
	

}
