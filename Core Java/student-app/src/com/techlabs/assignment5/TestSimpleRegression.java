package com.techlabs.assignment5;

import java.util.ArrayList;
import java.util.Scanner;


public class TestSimpleRegression {
	public static void main(String args[]) {
		Scanner input =new Scanner(System.in);
		ArrayList<Double> x=new ArrayList<Double>();
		ArrayList<Double> y=new ArrayList<Double>();
		ArrayList<Double> z=new ArrayList<Double>();
		System.out.println("enter the values of x");
		int a=0;
		double add=0;
		while (a==0){
			x.add(input.nextDouble());
			System.out.println("Enter 0 to continue");
			a=input.nextInt();
		}
		System.out.println("enter the values of y");
		a=0;
		while (a==0){
			y.add(input.nextDouble());
			System.out.println("Enter 0 to continue");
			a=input.nextInt();
		}
		for(double a1:x){
			add=add+a1;
		}
		double meanx=add/x.size();
		
		add=0;
		for(double a1:y){
			add=add+a1;
		}
		double meany=add/y.size();
		for(int i=0;i<x.size();i++){
			x.set(i, x.get(i)-meanx);
		}
		for(int i=0;i<y.size();i++){
			y.set(i, y.get(i)-meany);
		}
		for(int i=0;i<y.size();i++){
			z.add(x.get(i)*y.get(i));
		}
		for(int i=0;i<x.size();i++){
			x.set(i, x.get(i)*x.get(i));
		}
		for(int i=0;i<x.size();i++){
			
		}
		add=0.0;
		for(double a1:x){
			add=add+a1;
		}
		double b1=add;
		System.out.println(b1);
		add=0.0;
		for(double a1:z){
			add=add+a1;
		}
		b1=add/b1;
		
		double yy=meany=b1*meanx;
		System.out.println(yy);
	}
}
