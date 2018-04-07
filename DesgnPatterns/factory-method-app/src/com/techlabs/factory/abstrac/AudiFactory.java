package com.techlabs.factory.abstrac;

import com.techlabs.factory.abstac.bmw.BMWSUV;
import com.techlabs.factory.abstrac.audi.AudiHatchBack;
import com.techlabs.factory.abstrac.audi.AudiSUV;
import com.techlabs.factory.abstrac.audi.AudiSedan;

public class AudiFactory implements IAutoFactory{
	private static AudiFactory bucket;

	public static  AudiFactory getInstance(){
		if(bucket==null){
			bucket=new AudiFactory();
		}
		return bucket;
	}

	@Override
	public IAutomobile makeSUV() {
		return new AudiSUV();
	}

	@Override
	public IAutomobile makeSedan() {
		return new AudiSedan();
	}

	@Override
	public IAutomobile makeHatchBack() {
		return new AudiHatchBack();
	}
	

}
