package com.techlabs.factory.abstac.bmw;

import com.techlabs.factory.abstrac.IAutomobile;

public class BMWSedan implements IAutomobile{

	@Override
	public void start() {
		System.out.println("BMWSedan started");
		
	}

	@Override
	public void stop() {
		System.out.println("BMWSedan stopped");
		
	}

}
