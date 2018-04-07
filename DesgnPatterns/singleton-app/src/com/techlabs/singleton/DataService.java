package com.techlabs.singleton;

public class DataService {
	//private  DataService bucket;
	private DataService(){
		System.out.println("Service Created");
	}
	public static  DataService getInstance(){
		return new DataService();
	}
	public void doWork(){
		System.out.println("Object created with hash code "+ this.hashCode());
	}

}
