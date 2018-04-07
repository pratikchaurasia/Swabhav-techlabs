package com.techlabs.staticfactory;

public class Audi implements IAutomoblie {

	@Override
	public void start() {
		System.out.println("Audi started");
		
	}

	@Override
	public void stop() {
		System.out.println("Audi stopped");
		
	}

}
