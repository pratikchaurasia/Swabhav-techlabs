package com.techlabs.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.Action;
import com.techlabs.entity.LineItem;
import com.techlabs.service.CartService;

public class RemoveAction implements Action{
	@Autowired
	private CartService service=new CartService();
	
	public String remove() {
		String id = ServletActionContext.getRequest().getParameter("id");
		service.remove(id);
		return "success";
	}

	@Override
	public String execute() throws Exception {
		
		return this.SUCCESS;
	}
}
