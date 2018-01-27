package com.techlabs.db;

public class DepartmentDB implements ICrudable {
	public void create(){
		System.out.println("Department added");
	}
	public void read(){
		System.out.println("Read Departmentdb");
	}public void update(){
		System.out.println("Department updated");
	}public void delete(){
		System.out.println("Department deleted");
	}

}
