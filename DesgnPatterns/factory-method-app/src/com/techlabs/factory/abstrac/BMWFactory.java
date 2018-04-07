package com.techlabs.factory.abstrac;

import com.techlabs.factory.BMW;
import com.techlabs.factory.abstac.bmw.BMWHatchBack;
import com.techlabs.factory.abstac.bmw.BMWSUV;
import com.techlabs.factory.abstac.bmw.BMWSedan;


public class BMWFactory implements IAutoFactory{
	private static BMWFactory bucket;

	public static  BMWFactory getInstance(){
		if(bucket==null){
			bucket=new BMWFactory();
		}
		return bucket;
	}
	@Override
	public IAutomobile makeSUV() {
		return new BMWSUV();
	}
	@Override
	public IAutomobile makeSedan() {
		return new BMWSedan();
	}
	@Override
	public IAutomobile makeHatchBack() {
		return new BMWHatchBack();
	}

}
