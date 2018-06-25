package sync_async_calls;


import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateAndTime implements Runnable{
	
	public void getDateAndTime(){
		Calendar calender=new GregorianCalendar();
		Date date=calender.getTime();
		
		System.out.println(date);
	}
	

	@Override
	public void run() {
		while(true){
			getDateAndTime();
		}
	}
}

