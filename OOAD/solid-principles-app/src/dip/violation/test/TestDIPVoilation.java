package dip.violation.test;

import dip.violation.LogType;
import dip.violation.TaxCalculator;

public class TestDIPVoilation {
	public static void main(String args[]){
		TaxCalculator taxCalculator=new TaxCalculator(LogType.XML);
		taxCalculator.calculate(1000, 0);
	}
}
