package com.techlabs.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techlabs.entity.Customer;
import com.techlabs.entity.LineItem;
import com.techlabs.entity.Orders;
import com.techlabs.entity.Product;
import com.techlabs.repository.CartRepository;

@Service("serviceSVC")
public class CartService {
	@Autowired
	private CartRepository repo;

	
	private LineItem item;
	private List<Product> productList;

	private Set<LineItem> lineItem = new HashSet<>();
	private Set<Orders> orders;
	
	private Customer customer;
	private Orders order;

	public CartService() {
		users = new HashSet();
		//addUser("pratik", "123");
		System.out.println("Service Created");
	}

	public Set<LineItem> getLineItem() {
		return lineItem;
	}
	
	
	public Set<Orders> getOrders() {
		return orders;
	}


	public void setOrders(Set<Orders> orders) {
		this.orders = orders;
	}


	public void setLineItem(Set<LineItem> lineItem) {
		this.lineItem = lineItem;
	}

	public List<Product> getProductList() {
		return repo.getProducts();
	}

	public void editProduct(String id, String name, String email, String number) {
		// TODO Auto-generated method stub
	}

	public void addLineItem(Product product, int quantity) {
		item = new LineItem();
		item.setProduct(product);
		item.setQuantity(quantity);
		item.calculateItemCost();
		lineItem.add(item);
		//item.setOrder(order);
	}

	public Product getByID(UUID id) {
		return repo.getById(id);
	}

	public void updatePrice(LineItem item, int quantity) {
		item.addQuantity(quantity);
		item.setTotalCost(item.calculateItemCost());
	}

	public void saveOrderDetails(Customer c) {
		Date date = new Date();
		order =new Orders();
		orders=new HashSet<>();
		order.setDate(date);
		
		for (LineItem item:lineItem){
			item.setOrder(order);
		}
		order.setItems(lineItem);
		order.checkoutPrice();
		order.setCustomer(c);
		orders.add(order);
		c.setOrders(orders);
		repo.saveOrder(c);
		lineItem.clear();
	}

	public void addOrder(LineItem item, Date date) {

	}

	public void addToCart(int quantity, UUID selected) {
		Product product = getByID(selected);
		if (!lineItem.isEmpty()) {

			for (LineItem item : lineItem) {
				if (item.getProduct().getName().equals(product.getName())) {
					System.out.println("inside update");
					updatePrice(item, quantity);
					return;
				}
			}
			addLineItem(product, quantity);
		} else {
			addLineItem(product, quantity);
		}

	}

	public void remove(String i) {
		UUID id=UUID.fromString(i);
		for (LineItem item : lineItem) {
			if (item.getId().equals(id)) {
				lineItem.remove(item);
				return;
			}
		}
	}
	private Set<Customer> users;

	
	public void addUser(String name, String password) {
		Customer c1=new Customer();
		c1.setName(name);
		c1.setPassword(password);
		users.add(c1);
	}
	
	public boolean checkUser(String name, String password) {
		for(Customer c : repo.getCustomers()) {
			if(name.equals(c.getName()) && password.equals(c.getPassword())){
				setCustomer(c);
				return true;
			}
		}
		return false;
	}

	private void setCustomer(Customer c) {
		this.customer=c;
		
	}

	public Customer getCustomer() {
		return customer;
	}


	public Customer getHistory(Customer c) {
		return repo.history(c);
	}
}
