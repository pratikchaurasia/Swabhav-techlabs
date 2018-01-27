package com.techlabs.crud;

import java.util.HashMap;
import java.util.Map;

public class TestHashMap {
	public static void main(String args[]) {
		Map<String, Integer> hashmap = new HashMap<String, Integer>();

		// create
		hashmap.put("pratik", 100);
		hashmap.put("krishna", 101);
		print(hashmap);

		// read
		int rollNo = hashmap.get("pratik");
		System.out.println(rollNo);

		// update
		hashmap.put("ankit", 102);
		hashmap.remove("pratik");
		print(hashmap);

		// delete
		hashmap.clear();
		print(hashmap);

	}

	public static void print(Map<String, Integer> hashmap) {
		for (String name : hashmap.keySet()) {

			String key = name.toString();
			int value = hashmap.get(name);
			System.out.println(key + " " + value);

		}
	}
}