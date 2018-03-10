package com.techlabs.strategypattern.test;

import com.techlabs.strategypattern.Calculator;
import com.techlabs.strategypattern.OperationAdd;
import com.techlabs.strategypattern.OperationMultiply;
import com.techlabs.strategypattern.OperationSubstract;

public class TestCalculator {
   public static void main(String[] args) {
      Calculator context = new Calculator(new OperationAdd());		
      System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

      context = new Calculator(new OperationSubstract());		
      System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

      context = new Calculator(new OperationMultiply());		
      System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
   }
}