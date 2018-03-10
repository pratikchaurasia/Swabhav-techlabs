package com.techlabs.binarysearch.test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import com.techlabs.binarysearch.BubbleSort;

public class BubbleSortTest {

	@Test
	public void testBubbleSort() {
		BubbleSort b= new BubbleSort();
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(9);
		list.add(8);
		list.add(7);

		list=b.sort(list);
		ArrayList<Integer> newList=new ArrayList<Integer>();
		newList.add(7);
		newList.add(8);
		newList.add(9);
		

		assertEquals(newList, list);
		
	}

}
