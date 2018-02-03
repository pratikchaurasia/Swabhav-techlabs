package com.techlabs.vehicle;

public class TestVehicles {
	public static void main(String args[]){
		IMovable[] movable={new Car(),new Truck(),new Bike(),new Bike()};
		startRacing(movable);
	}
	public static void startRacing(IMovable[] movable){
		System.out.println("Race started");
		for(IMovable movables:movable){
			movables.move();
		}
		System.out.println("Race ended"
				+ "");
	}
}
