package com.techlabs.action;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.Action;
import com.techlabs.entity.LineItem;
import com.techlabs.entity.Product;
import com.techlabs.service.CartService;

public class DisplayAction implements Action, SessionAware {
	@Autowired
	private CartService service;
	
	private List<Product> productList;
	private Set<LineItem> lineItem = new HashSet<LineItem>();
	private Map<String, Object> userSession;
	private UUID selected;
	private int quantity;
	private double totalCost;

	
	public UUID getSelected() {
		return selected;
	}


	public double getTotalCost() {
		return totalCost;
	}


	public void setSelected(String selected) {
		this.selected=UUID.fromString(selected);
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}


	public List<Product> getProductList() {
		productList = service.getProductList();
		return productList;
	}
	

	@Override
	public String execute() throws Exception {
		return "success";
	}
	public Set<LineItem> getLineItem() {
		lineItem = service.getLineItem();
		return lineItem;
	}
	public void setLineItem(Set<LineItem> lineItem) {
		this.lineItem = lineItem;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		userSession = session;
	}
	public String getCost() {
		if (getQuantity() < 12) {
			setTotalCost(service.getByID(getSelected()).getPrice()* getQuantity());
		}
		return "success";
	}
	

}
