package com.techlabs.shopping;

public class Product {
	static private int TotalNoOfid;
	
	private int id;
	private String name;
	private double price;
	private double discountPercent;
	
	static {
		TotalNoOfid=10000;
	}
	public Product(String name,double price ){
		this.name=name;
		this.price=price;
		//this.discountPercent=discountPercent;
		id=generateId();
	}
	public int generateId(){
		return (++TotalNoOfid);
	}
	
	public double calculateDiscountCost(){
		return(price-(price*discountPercent*0.01));
	}
	public String getProductName(){
		return name;
	}
	public int getProducId(){
		return id;
	}
	public double getProductPrice(){
		return price;
	}
}
