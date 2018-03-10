package dip.refactor.test;

import dip.refactor.ILog;
import dip.refactor.TaxCalculator;
import dip.refactor.Xml;

public class TestDIPRefactor {
	public static void main(String args[]){
		TaxCalculator taxCalculator=new TaxCalculator(new Xml());
		taxCalculator.calculate(1000, 0);
	}
}
