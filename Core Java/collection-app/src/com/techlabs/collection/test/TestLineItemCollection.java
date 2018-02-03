package com.techlabs.collection.test;

import java.util.ArrayList;
import java.util.Iterator;

import com.techlabs.collection.LineItem;

public class TestLineItemCollection {
	public static void main(String args[]) {
		ArrayList cart = new ArrayList();
		cart.add(new LineItem(1, "pratik", 5, 10));
		cart.add(new LineItem(2, "krishna", 10, 15));
		cart.add(new LineItem(1, "ankit", 9, 6));
		// cart.add("hello");

		/*for (Object item : cart) {
			LineItem lineItem = (LineItem) item;
			System.out.println(lineItem.getId() + " " + lineItem.getName()
					+ " " + lineItem.calculateTotalCost());
		}*/

		for (Iterator i = cart.iterator(); i.hasNext();) {
			LineItem lineItem = (LineItem) i.next();
			System.out.println(lineItem.getId() + " " + lineItem.getName()
					+ " " + lineItem.calculateTotalCost());
		}
	}
}
