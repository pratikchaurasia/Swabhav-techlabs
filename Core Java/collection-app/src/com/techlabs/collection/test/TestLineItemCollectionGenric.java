package com.techlabs.collection.test;

import java.util.ArrayList;
import java.util.Iterator;

import com.techlabs.collection.LineItem;

public class TestLineItemCollectionGenric {
	public static void main(String args[]) {
		ArrayList<LineItem> cart = new ArrayList<LineItem>();
		cart.add(new LineItem(1, "pratik", 5, 10));
		cart.add(new LineItem(2, "krishna", 10, 15));
		cart.add(new LineItem(1, "ankit", 9, 6));
		// cart.add("hello");

		/*for (LineItem lineItem :cart) {
			System.out.println(lineItem.getId() + " " + lineItem.getName()
					+ " " + lineItem.calculateTotalCost());
		}

		for (Iterator i = cart.iterator(); i.hasNext();) {
			LineItem lineItem = (LineItem) i.next();
			System.out.println(lineItem.getId() + " " + lineItem.getName()
					+ " " + lineItem.calculateTotalCost());
		}*/
		print (cart);
	}
	public static  void print(Iterable<LineItem> items) {
		for(LineItem lineItem:items){
			System.out.println(lineItem.getId() + " " + lineItem.getName()
					+ " " + lineItem.calculateTotalCost());
		}
	}
}
