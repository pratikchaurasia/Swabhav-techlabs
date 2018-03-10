package dip.refactor;

public class TaxCalculator {
	private ILog log;
	
	public TaxCalculator(ILog log){
		this.log=log;
	}
	public void calculate(int salary, int r){
		int c=0;
		try{
			c=salary/r;
		}
		catch(Exception e){
			log.log(e.getMessage());
			throw e;
		}
	}
}
