package com.techlabs.action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.Action;
import com.techlabs.model.Order;
import com.techlabs.model.ProductService;

public class CheckoutAction implements Action{
	private ProductService service=ProductService.getInstance();
	private double orderCost;
	private static List<Order> orderList=new ArrayList<>();

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
