package com.techlabs.factory.abstrac.tesla;

import com.techlabs.factory.abstrac.IAutomobile;

public class TeslaHatchBack implements IAutomobile{
	@Override
	public void start() {
		System.out.println("TeslaHatchBack started");
		
	}

	@Override
	public void stop() {
		System.out.println("TeslaHatchBack stopped");
		
	}

}
