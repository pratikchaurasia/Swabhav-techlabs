package com.techlabs.ineritance.test;

import com.techlabs.ineritance.Boy;
import com.techlabs.ineritance.Infant;
import com.techlabs.ineritance.Kid;
import com.techlabs.ineritance.Man;

public class TestInheritance {
	public static void main(String args[]) {
		//case1();
		case2();
		//case3();
		//case4();
	}
	public static void case1(){
		System.out.println("Inside Case1");
		Man man;
		man=new Man();
		man.eat();
		man.play();
		man.read();
	}
	public static void case2(){
		System.out.println("Inside Case2");
		Boy boy;
		boy=new Boy();
		boy.eat();
		boy.play();
		boy.read();
		
	}
	public static void case3(){
		System.out.println("Inside Case3");
		Man man;
		man=new Boy();
		man.eat();
		man.play();
		man.read();
	}
	public static void case4(){
		System.out.println("Inside Case4");
		atThePark(new Man());
		atThePark(new Boy());
		atThePark(new Kid());
		atThePark(new Infant());
	}
	public static void atThePark(Man man){
		man.play();
	}
}
