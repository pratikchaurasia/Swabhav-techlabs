package com.techlabs.factory.abstrac.audi;

import com.techlabs.factory.abstrac.IAutomobile;

public class AudiSedan implements IAutomobile{

	@Override
	public void start() {
		System.out.println("AudiSedan started");
		
	}

	@Override
	public void stop() {
		System.out.println("AudiSedan stopped");
		
	}

}
