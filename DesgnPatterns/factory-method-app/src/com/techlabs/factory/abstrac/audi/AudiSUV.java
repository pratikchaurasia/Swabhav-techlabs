package com.techlabs.factory.abstrac.audi;

import com.techlabs.factory.abstrac.IAutomobile;

public class AudiSUV implements IAutomobile {

	@Override
	public void start() {
		System.out.println("AudiSUV started");
		
	}

	@Override
	public void stop() {
		System.out.println("AudiSUV stopped");
		
	}

}
