package com.techlabs.shopping.test;


import java.util.Date;

import com.techlabs.shopping.Customer;
import com.techlabs.shopping.LineItem;
import com.techlabs.shopping.Order;
import com.techlabs.shopping.Product;

public class TestCustomer {
	public static void main(String args[]){
		
		Product prd1=new Product("pen", 10, 20);
		Product prd2=new Product("pencil", 5, 20);
		Product prd3=new Product("Eraser", 3, 15);
		
		
		LineItem listItem1=new LineItem(prd1, 10);
		LineItem listItem2=new LineItem(prd2, 15);
		LineItem listItem3=new LineItem(prd3, 10);
		
		Order ord1=new Order(new Date());
		ord1.addLineitem(listItem1);
		ord1.addLineitem(listItem2);
		
		Order ord2=new Order(new Date());
		ord2.addLineitem(listItem3);
		ord2.addLineitem(listItem1);
		ord2.addLineitem(listItem1);
		
		Customer customer1=new Customer("Pratik");
		customer1.addOrder(ord1);
		
		Customer customer2=new Customer("krishna");
		customer2.addOrder(ord2);
		
		printDetails(customer1);
		printDetails(customer2);
	}
	public static void printDetails(Customer customer){
		System.out.println("Customer name is : "+customer.getCustomerName()+"\nCustomer Id : "+customer.getCustomerId());
		for(Order order:customer.getOrders()){
			System.out.println("Order Id : "+order.getOrderId()+"\nCheckout Price : "+order.checkoutPrice()+"\nDate :"+order.getDate());
			for(LineItem item:order.getLineItems()){
				System.out.println("LineItem id : "+item.getLineItemId()+"\nQuantity :"+item.getQuantity());
				System.out.println("Product id: "+item.getProduct().getProducId()+"\nProduct name: "+item.getProduct().getProductName());
			}
		}
		System.out.println();
	}
}
