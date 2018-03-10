package com.techlabs.strategypattern;

public class Calculator {
	   private IStrategy strategy;

	   public Calculator(IStrategy strategy){
	      this.strategy = strategy;
	   }

	   public int executeStrategy(int num1, int num2){
	      return strategy.doOperation(num1, num2);
	   }

	}