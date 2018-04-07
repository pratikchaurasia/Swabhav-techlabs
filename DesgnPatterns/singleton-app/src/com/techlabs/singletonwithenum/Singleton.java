package com.techlabs.singletonwithenum;

public enum Singleton {

    INSTANCE;

    public void message(){
    	System.out.println("New Instance Created");
    }

}