package sync_async_calls;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class SyncDateAndTime {
	public Date getDateAndTime(){
		Calendar calender=new GregorianCalendar();
		Date date=calender.getTime();
		
		return date;
	}
}
