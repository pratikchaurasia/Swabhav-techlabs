package com.techlabs.factory;

public class AudiFactory implements IAutoFactory{
	private static AudiFactory bucket;
	@Override
	public IAutomobile make() {
		return new Audi();
	}
	public static  AudiFactory getInstance(){
		if(bucket==null){
			bucket=new AudiFactory();
		}
		return bucket;
	}
	

}
