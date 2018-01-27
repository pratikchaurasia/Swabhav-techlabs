package com.techlabs.guitar.test;

import com.techlabs.guitar.Guitar;
import com.techlabs.guitar.Inventory;

public class FindGuitarTester {
	public static void main(String args){
		Inventory inventory=new Inventory();
		initializeInventory(inventory);
		Guitar whatErinLikes=new Guitar("", 0, "fender", "Stratocastor", "electric", "Alder", "Alder");
		
		Guitar guitar=inventory.search(whatErinLikes);
		if(guitar!=null){
			System.out.println("Erin, you might like this"+guitar.getBuilder()+""+guitar.getModel()+""+guitar.getType()+""+guitar.getBackWood()+""+guitar.getTopWood()+""+guitar.getPrice());
		}
		else{
			System.out.println("Sory erin, we have nothing for you");
		}
	}
	private static void initializeInventory(Inventory inventory){
		
	}
}
