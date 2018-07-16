package com.techlabs.model;



import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Order {
	private static int orderId;
	private int id;
	private Date date;
	private double totalPrice=0;
	private List<LineItem> items;
	
	static {
		orderId=10000;
	}
	public Order(List<LineItem> item, Date date){
		this.items=item;
		this.date=date;
		id=generateId();
	}
	
	public double checkoutPrice(){
		for(LineItem item:items){
			totalPrice=totalPrice+item.getTotalCost();
		}
		return totalPrice;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	public int generateId(){
		return (++orderId);
	}
	
	public Date getDate(){
		return date;
	}
}
