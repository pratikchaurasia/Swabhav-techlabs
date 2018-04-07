package com.techlabs.factory.abstac.bmw;

import com.techlabs.factory.abstrac.IAutomobile;

public class BMWHatchBack implements IAutomobile{

	@Override
	public void start() {
		System.out.println("BMWHatchBack started");
		
	}

	@Override
	public void stop() {
		System.out.println("BMWHatchBack stopped");
		
	}

}
