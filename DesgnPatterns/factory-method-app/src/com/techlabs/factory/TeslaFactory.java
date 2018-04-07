package com.techlabs.factory;

public class TeslaFactory implements IAutoFactory {
	private static  TeslaFactory bucket;
	@Override
	public IAutomobile make() {
		
		return new Tesla();
	}
	public static  TeslaFactory getInstance(){
		if(bucket==null){
			bucket=new TeslaFactory();
		}
		return bucket;
	}

}
