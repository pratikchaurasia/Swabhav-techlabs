package com.techlabs.factory;

public class Tesla implements IAutomobile {

	@Override
	public void start() {
		System.out.println("Tesla started");
		
	}

	@Override
	public void stop() {
		System.out.println("Tesla stopped");
		
	}

}
