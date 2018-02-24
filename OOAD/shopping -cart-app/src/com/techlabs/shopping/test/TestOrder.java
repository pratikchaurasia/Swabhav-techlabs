package com.techlabs.shopping.test;

import java.util.Date;

import com.techlabs.shopping.LineItem;
import com.techlabs.shopping.Order;
import com.techlabs.shopping.Product;

public class TestOrder {
	public static void main(String args[]){
		
		Product prd1=new Product("pen", 10, 20);
		Product prd2=new Product("pencil", 5, 20);
		
		LineItem l1=new LineItem(prd1, 10);
		LineItem l2=new LineItem(prd2, 15);
		
		Order ord1=new Order(new Date());
		ord1.addLineitem(l1);
		ord1.addLineitem(l2);
		
		System.out.println(ord1.checkoutPrice());
		System.out.println(ord1.getDate());
	}
}
