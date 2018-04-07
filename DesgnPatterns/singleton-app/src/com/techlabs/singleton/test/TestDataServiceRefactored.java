package com.techlabs.singleton.test;

import com.techlabs.singleton.refactor.DataServiceRefactored;



public class TestDataServiceRefactored {
	public static void main(String args[]){
		DataServiceRefactored service1=DataServiceRefactored.getInstance();
		DataServiceRefactored service2=DataServiceRefactored.getInstance();
		
		service1.doWork();
		service2.doWork();
	}
		
}
