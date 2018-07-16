package com.techlabs.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.Action;
import com.techlabs.model.LineItem;
import com.techlabs.model.Product;
import com.techlabs.model.ProductService;

public class AddToCartAction implements Action,SessionAware{
	private Map<String, Object> userSession;
	private String selected;
	private int quantity;
	private  List<LineItem> lineItem = new ArrayList<LineItem>();
	private ProductService service = ProductService.getInstance();

	@Override
	public String execute() throws Exception {
		return this.SUCCESS;
	}
	public String getSelected() {
		return selected;
	}
	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void setSelected(String selected) {
		this.selected = selected;
	}

	public String addToCart() {
		if (userSession.isEmpty()) {
			System.out.println("true");
			return "login";
		}
		Product product = service.getByID(selected);
		if (!lineItem.isEmpty()) {
			for (LineItem item : lineItem) {
				if (item.getProduct().equals(product)) {
					service.updatePrice(item, quantity);
					return "success";
				}
			}
			service.addLineItem(product, quantity);
		} else {
			service.addLineItem(product, quantity);
		}
		return "success";
	}
	@Override
	public void setSession(Map<String, Object> session) {
		userSession = session;
	}
}
