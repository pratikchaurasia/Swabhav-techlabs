package com.techlabs.staticfactory;

public class AutoMobileFactory {
	public static IAutomoblie make(AutoType type){
		if(type==AutoType.BMW){
			return new BMW();
		}
		else if(type==AutoType.Audi){
			return new Audi();
		}
		else{
			return new Tesla();
		}
	}

}
