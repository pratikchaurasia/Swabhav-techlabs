package com.techlabs.components;

public class File implements IDriveItems{
	private String name;
	private int size;
	@Override
	public void showContent(int level) {
		while(level>0){
			System.out.print("\t");
			level--;
		}
		System.out.println("File name  "+name+" size is "+size);
	}
	public File(String name,int size){
		this.name=name;
		this.size=size;
	}
	public String getName(){
		return name;
	}
	public int getSize(){
		return size;
	}

}
