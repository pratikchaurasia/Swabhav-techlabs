package com.techlabs.interfacepoly.test;

import com.techlabs.interfacepoly.Boy;
import com.techlabs.interfacepoly.IEmotionable;
import com.techlabs.interfacepoly.IMannerable;
import com.techlabs.interfacepoly.Man;

public class TestPolymorphism {
	public static void main(String args[]){
		Man man=new Man();
		Boy boy=new Boy();
		
		atThePary(man);
		atThePary(boy);
		
		atTheMovie(boy);
		//atTheMovie(man);
		
	}
	public static void atThePary(IMannerable obj){
		System.out.println("At the party");
		obj.wish();
		obj.depart();
		
	}
	public static void atTheMovie(IEmotionable obj){
		System.out.println("At the movie");
		obj.cry();
		obj.laugh();
		
	}
}
