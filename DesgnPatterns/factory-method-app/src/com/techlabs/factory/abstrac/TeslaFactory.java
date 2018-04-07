package com.techlabs.factory.abstrac;

import com.techlabs.factory.abstrac.audi.AudiSedan;
import com.techlabs.factory.abstrac.tesla.TeslaHatchBack;
import com.techlabs.factory.abstrac.tesla.TeslaSUV;
import com.techlabs.factory.abstrac.tesla.TeslaSedan;

public class TeslaFactory implements IAutoFactory {
	private static  TeslaFactory bucket;

	public static  TeslaFactory getInstance(){
		if(bucket==null){
			bucket=new TeslaFactory();
		}
		return bucket;
	}

	@Override
	public IAutomobile makeSUV() {
		return new TeslaSUV();
	}

	@Override
	public IAutomobile makeSedan() {
		return new TeslaSedan();
	}

	@Override
	public IAutomobile makeHatchBack() {
		return new TeslaHatchBack();
	}

}
