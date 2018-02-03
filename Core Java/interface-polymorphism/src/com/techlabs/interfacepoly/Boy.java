package com.techlabs.interfacepoly;

public class Boy implements IMannerable,IEmotionable {
	@Override
	public void wish(){
		System.out.println("Boy wishes");
	}
	@Override
	public void depart(){
		System.out.println("Boy departs");
	}
	@Override
	public void cry(){
		System.out.println("Boy cries");
	}
	@Override
	public void laugh(){
		System.out.println("Boy laughs");
	}
}
