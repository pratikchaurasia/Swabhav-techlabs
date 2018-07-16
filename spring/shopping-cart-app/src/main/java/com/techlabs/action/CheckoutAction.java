package com.techlabs.action;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.Action;
import com.techlabs.entity.Orders;
import com.techlabs.service.CartService;

public class CheckoutAction implements Action{
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
		orderCost=service.getOrderCost();
		return this.SUCCESS;
	}

}
