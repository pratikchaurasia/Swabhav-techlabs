package com.techlabs.factory;


public class BMWFactory implements IAutoFactory{
	private static BMWFactory bucket;

	@Override
	public IAutomobile make() {
		return new BMW();
	}
	public static  BMWFactory getInstance(){
		if(bucket==null){
			bucket=new BMWFactory();
		}
		return bucket;
	}

}
