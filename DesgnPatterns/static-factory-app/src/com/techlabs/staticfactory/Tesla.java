package com.techlabs.staticfactory;

public class Tesla implements IAutomoblie {

	@Override
	public void start() {
		System.out.println("Tesla started");
		
	}

	@Override
	public void stop() {
		System.out.println("Tesla stopped");
		
	}

}
