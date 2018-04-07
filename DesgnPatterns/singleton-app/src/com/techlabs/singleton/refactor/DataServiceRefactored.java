package com.techlabs.singleton.refactor;

import com.techlabs.singleton.DataService;

public class DataServiceRefactored {
	private static  DataServiceRefactored bucket;
	private DataServiceRefactored(){
		System.out.println("Service Created");
	}
	public static  DataServiceRefactored getInstance(){
		if(bucket==null){
			bucket=new DataServiceRefactored();
		}
		return bucket;
	}
	public void doWork(){
		System.out.println("Object created with hash code "+ this.hashCode());
	}

}