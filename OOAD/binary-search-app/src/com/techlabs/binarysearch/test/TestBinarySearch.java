package com.techlabs.binarysearch.test;

import java.io.IOException;
import java.util.ArrayList;

import com.techlabs.binarysearch.BinarySearch;
import com.techlabs.binarysearch.BubbleSort;
import com.techlabs.binarysearch.ConsoleInputOutput;
import com.techlabs.binarysearch.MergeSort;

public class TestBinarySearch {
	public static void main(String args[]) throws IOException{
		BinarySearch search=new BinarySearch(new BubbleSort());
		ConsoleInputOutput inputOutput=new ConsoleInputOutput();
		
		ArrayList<Integer> list=search.getList();
		list=inputOutput.inputElementsInList(list);
		int key=inputOutput.inputKey();
		
		inputOutput.beforeSorting(list);
		int index=search.binarySearch(key);
		
		inputOutput.afterSorting(list);	
		inputOutput.displayIndex(key, index);
		
	}
}
