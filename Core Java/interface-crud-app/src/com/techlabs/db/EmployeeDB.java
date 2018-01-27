package com.techlabs.db;

public class EmployeeDB implements ICrudable {
	public void create(){
		System.out.println("Employee added");
	}
	public void read(){
		System.out.println("Read EmployeeDB");
	}public void update(){
		System.out.println("Employee updated");
	}public void delete(){
		System.out.println("Employee deleted");
	}

}
