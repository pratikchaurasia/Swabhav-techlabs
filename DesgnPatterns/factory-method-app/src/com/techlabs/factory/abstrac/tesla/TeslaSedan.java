package com.techlabs.factory.abstrac.tesla;

import com.techlabs.factory.abstrac.IAutomobile;

public class TeslaSedan implements IAutomobile{
	@Override
	public void start() {
		System.out.println("TeslaSedan started");
		
	}

	@Override
	public void stop() {
		System.out.println("TeslaSedan stopped");
		
	}

}
