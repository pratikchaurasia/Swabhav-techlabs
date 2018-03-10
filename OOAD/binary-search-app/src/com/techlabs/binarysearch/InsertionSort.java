package com.techlabs.binarysearch;

import java.util.ArrayList;

public class InsertionSort implements ISortable {

	@Override
	public ArrayList<Integer> sort(ArrayList<Integer> list) {
		
		for (int i = 1; i < list.size(); i++) {
			int key = list.get(i);
			for (int j = i - 1; j >= 0; j--) {
				if (key < list.get(j)) {
					list.set(j + 1, list.get(j));
					if (j == 0) {
						list.set(0, key);
					}
				} else {
					list.set(j + 1, key);
					break;
				}
			}
		}

		return list;
	}

}
