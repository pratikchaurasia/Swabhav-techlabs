package com.techlabs.singleton.test;

import com.techlabs.singletonwithenum.Singleton;

public class TestSingletonUsingEnum {
    public static void main(String[] args) {

        Singleton singleton = Singleton.INSTANCE;
        Singleton singleton1 = Singleton.INSTANCE;
        
        if (singleton==singleton1){
        	System.out.println("Both object are same");
        }
    }
}
