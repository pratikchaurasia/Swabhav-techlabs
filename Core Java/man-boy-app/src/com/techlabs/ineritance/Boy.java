package com.techlabs.ineritance;

public class Boy extends Man{
	public Boy()
	{
		System.out.println("Boy created");
	}
	public void walk(){
		System.out.println("Boy is walking");
	}
	@Override
	public void play(){
		System.out.println("Boy is playing");
	}
}
