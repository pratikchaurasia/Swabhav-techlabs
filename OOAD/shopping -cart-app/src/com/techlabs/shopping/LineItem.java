package com.techlabs.shopping;

public class LineItem {
	private static int lineItemId;
	
	private int quantity;
	private Product product;
	private int id;
	private double totalCost;
	
	static {
		lineItemId=1000;
	}
	
	public LineItem(Product product, int quantity) {
		this.product =product;
		this.quantity=quantity;
		id=generateId();
	}
	public int generateId(){
		return (++lineItemId);
	}
	public double calculateItemCost(){
		totalCost=product.calculateDiscountCost()*quantity;
		return totalCost;
	}
	public int getLineItemId(){
		return id;
	}
	public int getQuantity(){
		return quantity;
	}
	public Product getProduct(){
		return product;
	}
	public void addQuantity(int quant){
		quantity=quantity+quant;
	}
	
}
