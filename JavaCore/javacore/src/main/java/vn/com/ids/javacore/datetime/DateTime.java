package vn.com.ids.javacore.datetime;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateTime {
	public void getFirtDateOfWeekInYear(int weekOfyear) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd MM yyyy");
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.WEEK_OF_YEAR, weekOfyear);        
		cal.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
		System.out.println(sdf.format(cal.getTime()));
	}
}
