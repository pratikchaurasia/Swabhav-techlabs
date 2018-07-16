package com.techlabs.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.Action;
import com.techlabs.entity.LineItem;
import com.techlabs.entity.Product;
import com.techlabs.service.CartService;

public class AddToCartAction implements Action,SessionAware{
	private Map<String, Object> userSession;
	private UUID selected;
	private int quantity;
	
	@Autowired
	private CartService service;
	@Override
	public String execute() throws Exception {
		return this.SUCCESS;
	}
	public UUID getSelected() {
		return selected;
	}
	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void setSelected(String selected) {
		this.selected=UUID.fromString(selected);
	}

	public String addToCart() {
		if (userSession.isEmpty()) {
			System.out.println("true");
			return "login";
		}
		service.addToCart(quantity,selected);
		return "success";
	}
	@Override
	public void setSession(Map<String, Object> session) {
		userSession = session;
	}
}
