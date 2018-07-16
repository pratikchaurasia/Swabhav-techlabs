package com.techlabs.action;

import java.util.ArrayList;
import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.Action;
import com.techlabs.model.LineItem;
import com.techlabs.model.ProductService;

public class RemoveAction implements Action{
	private List<LineItem> lineItem = new ArrayList<LineItem>();
	private ProductService service = ProductService.getInstance();
	
	public String remove() {
		String id = ServletActionContext.getRequest().getParameter("id");
		lineItem=service.getLineItem();
		for (LineItem item : lineItem) {
			if (item.getId() == Integer.parseInt(id)) {
				lineItem.remove(item);
				return "success";
			}
		}
		return "success";
	}

	@Override
	public String execute() throws Exception {
		
		return this.SUCCESS;
	}
}
