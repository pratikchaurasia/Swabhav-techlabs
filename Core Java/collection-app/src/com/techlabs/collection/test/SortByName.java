package com.techlabs.collection.test;

import java.util.Comparator;

import com.techlabs.collection.LineItem;

public class SortByName implements Comparator<LineItem> {
		public int compare(LineItem name1, LineItem name2) {
			return name1.getName().compareTo(name2.getName());
		}
}
