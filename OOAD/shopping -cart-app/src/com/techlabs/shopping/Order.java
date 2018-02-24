package com.techlabs.shopping;

import java.util.ArrayList;
import java.util.Date;

public class Order {
	private static int orderId=100;
	
	private int id;
	private Date date;
	private double totalPrice=0;
	private ArrayList<LineItem> list= new ArrayList<LineItem>();
	
	static {
		orderId=10000;
	}
	
	public Order(Date date){
		this.date=date;
		id=generateId();
	}
	
	public int generateId(){
		return (++orderId);
	}
	
	public void addLineitem(LineItem item){
		for (LineItem items:list){
			if(items.getProduct().getProducId()==item.getProduct().getProducId()){
				items.addQuantity(item.getQuantity());
				return;
			}
		}
		list.add(item);
	}
	public ArrayList<LineItem> getLineItems(){
		return list;
	}
	public double checkoutPrice(){
		for(LineItem item:list){
			totalPrice=totalPrice+item.calculateItemCost();
		}
		return totalPrice;
	}
	public int getOrderId(){
		return id;
	}
	public Date getDate(){
		return date;
	}
}
