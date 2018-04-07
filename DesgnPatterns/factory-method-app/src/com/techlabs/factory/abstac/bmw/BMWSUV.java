package com.techlabs.factory.abstac.bmw;

import com.techlabs.factory.abstrac.IAutomobile;

public class BMWSUV implements IAutomobile {

	@Override
	public void start() {
		System.out.println("BMWSUV started");
		
	}

	@Override
	public void stop() {
		System.out.println("BMWSUV stopped");
		
	}

}
