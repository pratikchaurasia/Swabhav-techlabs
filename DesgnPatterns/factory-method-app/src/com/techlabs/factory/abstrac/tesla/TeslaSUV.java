package com.techlabs.factory.abstrac.tesla;

import com.techlabs.factory.abstrac.IAutomobile;

public class TeslaSUV implements IAutomobile {

	@Override
	public void start() {
		System.out.println("TeslaSUV started");
		
	}

	@Override
	public void stop() {
		System.out.println("TeslaSUV stopped");
		
	}

}
