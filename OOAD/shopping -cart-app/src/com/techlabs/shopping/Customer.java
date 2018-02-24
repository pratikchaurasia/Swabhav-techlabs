package com.techlabs.shopping;

import java.util.ArrayList;

public class Customer {
	private static int customerId=100;
	
	private int id;
	private String name;
	private ArrayList<Order> list= new ArrayList<Order>();
	
	public Customer(String name){
		this.name=name;
		id=generateId();
	}
	public void addOrder(Order order){
		list.add(order);
	}
	public int generateId(){
		return (++customerId);
	}
	public String getCustomerName(){
		return name;
	}
	public int getCustomerId(){
		return id;
	}
	public ArrayList<Order> getOrders(){
		return list;
	}
}
