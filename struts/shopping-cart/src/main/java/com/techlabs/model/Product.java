package com.techlabs.model;

import java.util.UUID;

public class Product {
	static private int TotalNoOfid;
	
	private String id;
	private String name;
	private double price;
	private double discountPercent;
	

	public Product(String name,double price ){
		this.name=name;
		this.price=price;
		//this.discountPercent=discountPercent;
		this.id=UUID.randomUUID().toString();
	}
	public double calculateDiscountCost(){
		return(price-(price*discountPercent*0.01));
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
}
