package com.techlabs.db;

public class CustomerDB implements ICrudable {
	public void create(){
		System.out.println("Customer added");
	}
	public void read(){
		System.out.println("Read CustomerDB");
	}public void update(){
		System.out.println("Customer updated");
	}public void delete(){
		System.out.println("Customer deleted");
	}

}
