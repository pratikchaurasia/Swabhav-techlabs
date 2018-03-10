package com.techlabs.binarysearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ConsoleInputOutput {
	BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

	public ArrayList<Integer> inputElementsInList(ArrayList<Integer> list)
			throws IOException {
		boolean flag = true;
		while (flag == true) {
			System.out.println("Enter the element ");
			int element = Integer.parseInt(input.readLine());
			list.add(element);

			System.out.println("Type Exit to stop ");
			String exit = input.readLine();
			if (exit.equalsIgnoreCase("exit")) {
				flag = false;
			}
		}
		return list;
	}

	public void beforeSorting(ArrayList<Integer> list) {
		System.out.println("\nBefore Sorting");
		for (int element : list) {
			System.out.print(element + "\t");
		}
	}

	public int inputKey() throws NumberFormatException, IOException {
		System.out.println("\nEnter the key element to be searched ");
		int key = Integer.parseInt(input.readLine());
		return key;

	}

	public void afterSorting(ArrayList<Integer> list) {
		System.out.println("\nAfter Sorting");
		for (int element : list) {
			System.out.print(element + "\t");
		}
	}

	public void displayIndex(int key, int index) {
		if (index < 0) {
			System.out.println("\nSorry Element not found");
			return;
		}
		System.out.println("\nThe key " + key + " is found at position "+ (index + 1));
	}
}
