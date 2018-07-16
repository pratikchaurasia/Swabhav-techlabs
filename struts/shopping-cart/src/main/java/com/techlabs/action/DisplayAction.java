package com.techlabs.action;

import java.nio.channels.SeekableByteChannel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.Action;
import com.techlabs.model.LineItem;
import com.techlabs.model.Product;
import com.techlabs.model.ProductService;

public class DisplayAction implements Action, SessionAware {

	private ProductService service = ProductService.getInstance();
	private List<Product> productList;
	private List<LineItem> lineItem = new ArrayList<LineItem>();
	private Map<String, Object> userSession;

	public List<Product> getProductList() {
		productList = service.getProductList();
		return productList;
	}

	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}

	@Override
	public String execute() throws Exception {
		return "success";
	}
	public List<LineItem> getLineItem() {
		lineItem = service.getLineItem();
		return lineItem;
	}
	public void setLineItem(List<LineItem> lineItem) {
		this.lineItem = lineItem;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		userSession = session;
	}

}
