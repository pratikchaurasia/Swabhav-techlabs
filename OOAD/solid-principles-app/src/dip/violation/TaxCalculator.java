package dip.violation;

public class TaxCalculator {
	private LogType logType;
	
	public TaxCalculator(LogType logType){
		this.logType=logType;
	}
	public void calculate(int salary, int r){
		int c=0;
		try{
			c=salary/r;
		}
		catch(Exception e){
			if(logType==LogType.XML){
				XmlLogger xmlLogger=new XmlLogger();
				xmlLogger.log(e.getMessage());
			}
			else if(logType==LogType.CSV){
				CsvLogger csvLogger=new CsvLogger();
				csvLogger.log(e.getMessage());
			}
		}
	}
}
