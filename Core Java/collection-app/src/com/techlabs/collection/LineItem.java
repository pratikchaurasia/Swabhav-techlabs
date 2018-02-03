package com.techlabs.collection;

public class LineItem implements Comparable<LineItem>{
	private int id;
	private String name;
	private int quantity;
	private double unitPrice;
	
	public LineItem(int id,String name,int quantity,double unitPrice){
		this.id=id;
		this.name=name;
		this.quantity=quantity;
		this.unitPrice=unitPrice;
	}
	
	public double calculateTotalCost(){
		return quantity*unitPrice;
	}
	
	public String getName() {
		return name;
	}
	
	public int getId() {
		return id;
	}
	
	public int compareTo(LineItem item) {
		if (this.getId() ==item.getId())
			return 0;
		else if (this.getId()>item.getId())
			return 1;
		else
			return -1;
	}
}
