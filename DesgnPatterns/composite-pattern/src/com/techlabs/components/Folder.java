package com.techlabs.components;

import java.util.ArrayList;

public class Folder implements IDriveItems {
	private ArrayList<IDriveItems> items =new ArrayList<IDriveItems>();
	private String name;
	
	public Folder(String name){
		this.name=name;
	}
	@Override
	public void showContent(int level) {
		int dummyLevel=level;
		while(level>0){
			System.out.print("\t");
			level--;
		}
		System.out.println("Name of folder "+name+" ");
		for (IDriveItems item:items){
			item.showContent(dummyLevel+1);
		}
	
	}
	public void addItems(IDriveItems item){
		items.add(item);
	}

}
