package com.techlabs.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductService {

	private List<Product> productList;
	private List<LineItem> lineItem;
	private List<Order> orderList;

	static {
		service = new ProductService();
	}

	public List<LineItem> getLineItem() {
		return lineItem;
	}

	public void setLineItem(List<LineItem> lineItem) {
		this.lineItem = lineItem;
	}

	private static ProductService service;

	public static ProductService getInstance() {
		return service;
	}

	public ProductService() {
		productList = new ArrayList<Product>();
		lineItem = new ArrayList<LineItem>();
		orderList=new ArrayList<>();
		productList.add(new Product("Redmi Note 4", 11000));
		productList.add(new Product("Redmi Note 3", 9000));
		productList.add(new Product("iphone", 2000));
		// System.out.println(contactList.size());
	}

	public List<Product> getProductList() {
		if (!(productList.isEmpty())) {
			return productList;
		}
		return null;
	}

	public void editProduct(String id, String name, String email, String number) {
		// TODO Auto-generated method stub
	}

	public void addLineItem(Product product, int quantity) {
		lineItem.add(new LineItem(product, quantity));
	}

	public Product getByID(String id) {

		for (Product product : productList) {
			if (id.equals(product.getId())) {
				//System.out.println("true");
				return product;
			}
		}
		return null;
	}

	public void updatePrice(LineItem item, int quantity) {
		item.addQuantity(quantity);
		item.setTotalCost(item.calculateItemCost());
	}

	public double getOrderCost() {
		Date date=new Date();
		Order order=new Order(lineItem, date);
		return order.checkoutPrice();
	}
	
	public void addOrder(LineItem item, Date date) {
		orderList.add(new Order(lineItem, date));
		
	}
}
