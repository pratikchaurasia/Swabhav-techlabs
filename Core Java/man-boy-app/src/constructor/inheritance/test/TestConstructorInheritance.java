package constructor.inheritance.test;

import constructor.inheritance.A;
import constructor.inheritance.B;

public class TestConstructorInheritance {
	public static void main(String args[]){
		A a=new A(10);
		B b=new B();
		B b1=new B(100);
		
		System.out.println(a.getFoo());
		System.out.println(b.getFoo());
		System.out.println(b1.getFoo());
		
	}
}
