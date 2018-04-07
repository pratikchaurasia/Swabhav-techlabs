package com.techlabs.staticfactory;

public class BMW implements IAutomoblie {

	@Override
	public void start() {
		System.out.println("BMW started");
		
	}

	@Override
	public void stop() {
		System.out.println("BMW stopped");
		
	}

}
