package com.techlabs.staticfactory.test;

import com.techlabs.staticfactory.AutoMobileFactory;
import com.techlabs.staticfactory.AutoType;
import com.techlabs.staticfactory.IAutomoblie;

public class TestAutoMobileFactory {
	public static void main(String args[]){
		IAutomoblie auto1=AutoMobileFactory.make(AutoType.Tesla);
		IAutomoblie auto2=AutoMobileFactory.make(AutoType.BMW);
		IAutomoblie auto3=AutoMobileFactory.make(AutoType.Audi);
			
		System.out.println(auto1.getClass());
		auto1.start();
	}
}
