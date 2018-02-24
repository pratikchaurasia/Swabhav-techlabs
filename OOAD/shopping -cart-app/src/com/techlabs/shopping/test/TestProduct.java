package com.techlabs.shopping.test;

import java.io.ObjectInputStream.GetField;

import com.techlabs.shopping.Product;

public class TestProduct {
	public static void main(String args[]){
		Product apple=new Product("apple", 100, 5);
		Product pen=new Product("pen", 10, 5);
		System.out.println("Discount price is :"+apple.calculateDiscountCost());
		System.out.println("id is:"+apple.getProducId());
		System.out.println("id is:"+pen.getProducId());
	}
}
