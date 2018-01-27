package com.techlabs.db.test;

import com.techlabs.db.CustomerDB;
import com.techlabs.db.DepartmentDB;
import com.techlabs.db.EmployeeDB;
import com.techlabs.db.ICrudable;

public class TestDB {
	public static void main(String args[]){
		doDBOperation(new CustomerDB());
		doDBOperation(new DepartmentDB());
		doDBOperation(new EmployeeDB());
		
	}
	public static void doDBOperation(ICrudable x){
		System.out.println("Doing DB Operations");
		x.create();
		x.read();
		x.update();
		x.delete();
	}
}
