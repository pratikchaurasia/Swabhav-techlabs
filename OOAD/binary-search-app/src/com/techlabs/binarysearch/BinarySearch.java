package com.techlabs.binarysearch;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class BinarySearch {
	private ArrayList<Integer> list = new ArrayList<Integer>();
	private ISortable sortingAlgorithm;
	

	public BinarySearch(ISortable sortingAlgorithm) {
		this.sortingAlgorithm = sortingAlgorithm;
	}

	public void binarySearch() throws IOException {
		
	this.sortingAlgorithm.sort(list);
	int index=Collections.binarySearch(list, key);
		
	}
	public ArrayList<Integer> getList(){
		return list;
	}
}
