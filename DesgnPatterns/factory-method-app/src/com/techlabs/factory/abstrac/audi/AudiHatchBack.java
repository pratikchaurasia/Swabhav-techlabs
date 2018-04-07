package com.techlabs.factory.abstrac.audi;

import com.techlabs.factory.abstrac.IAutomobile;

public class AudiHatchBack implements IAutomobile{

	@Override
	public void start() {
		System.out.println("AudiHatchBack started");
		
	}

	@Override
	public void stop() {
		System.out.println("AudiHatchBack stopped");
		
	}

}
