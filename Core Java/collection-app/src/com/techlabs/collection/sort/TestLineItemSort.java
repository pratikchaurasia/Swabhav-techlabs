package com.techlabs.collection.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.techlabs.collection.LineItem;
import com.techlabs.collection.test.SortByName;

public class TestLineItemSort{
	public static void main(String args[]) {
		ArrayList cart = new ArrayList();
		cart.add(new LineItem(2, "pratik", 5, 10));
		cart.add(new LineItem(1, "krishna", 10, 15));
		cart.add(new LineItem(3, "ankit", 9, 6));
		
		System.out.println("Before Sorting");
		print (cart);
		Collections.sort(cart);
		System.out.println("After Sorting");
		print (cart);
		
		System.out.println("Before Sorting");
		print (cart);
		Collections.sort(cart,new SortByName());
		System.out.println("After Sorting");
		print (cart);
	}

	public static  void print(Iterable<LineItem> items) {
		for(LineItem lineItem:items){
			System.out.println(lineItem.getId() + " " + lineItem.getName()
					+ " " + lineItem.calculateTotalCost()+"");
		}
		System.out.println();
	}

	
}
