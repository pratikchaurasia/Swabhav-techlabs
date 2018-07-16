package com.techlabs.model;

public class LineItem {
	private static int lineItemId;

	private int quantity;
	private Product product;
	private int id;
	private double totalCost;

	static {
		lineItemId = 0;
	}

	public LineItem(Product product, int quantity) {
		this.product = product;
		this.quantity = quantity;
		id = generateId();
		this.totalCost = calculateItemCost();
	}

	public int generateId() {
		//System.out.println(lineItemId);
		return (++lineItemId);
	}

	public double calculateItemCost() {
		totalCost = product.getPrice() * quantity;
		return totalCost;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public Product getProduct() {
		return product;
	}

	public void addQuantity(int quant) {
		quantity = quantity + quant;
	}

}
