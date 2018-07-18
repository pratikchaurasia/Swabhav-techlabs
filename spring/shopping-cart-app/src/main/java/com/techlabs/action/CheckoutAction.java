package com.techlabs.action;

import java.nio.channels.SeekableByteChannel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;

import com.opensymphony.xwork2.Action;
import com.techlabs.entity.Customer;
import com.techlabs.entity.Orders;
import com.techlabs.service.CartService;

public class CheckoutAction implements Action,SessionAware{
	private Map<String, Object> userSession;
	@Autowired
	private CartService service;
	private double orderCost;
	
	
	public double getOrderCost() {
		//System.out.println("inside");
		return orderCost;
	}

	public void setOrderCost(double orderCost) {
		this.orderCost = orderCost;
	}

	@Override
	public String execute() throws Exception {
		Customer c=(Customer)userSession.get("customer");
		service.saveOrderDetails(c);
		userSession.replace("customer", service.getHistory(c));
		return this.SUCCESS;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		userSession = session;
		System.out.println(userSession.size());
	}

}
