package vn.com.ids.javacore.datetime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.ZoneId;
import java.time.zone.ZoneRules;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DateUtil {
	private static final Logger logger = LoggerFactory.getLogger(DateUtil.class);
	private static final SimpleDateFormat formatter = new SimpleDateFormat("HH:mm dd/MM/yyyy");
	private static final String BELGIUM_ZONE_ID = "Europe/Brussels";

	public static void getFirtDateOfWeekInYear(int weekOfyear) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd MM yyyy");
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.WEEK_OF_YEAR, weekOfyear);
		cal.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
		System.out.println(sdf.format(cal.getTime()));
	}

	// 	https://stackoverflow.com/questions/1060479/determine-whether-daylight-savings-time-dst-is-active-in-java-for-a-specified
	public static boolean isDaylightSavingTime() {
		return ZoneId.of(BELGIUM_ZONE_ID)  // Represent a specific time zone, the history of past, present, and future changes to the offset-from-UTC used by the people of a certain region.  
	      .getRules()                // Obtain the list of those changes in offset. 
	      .isDaylightSavings(        // See if the people of this region are observing Daylight Saving Time at a specific moment.
	          Instant.now()          // Specify the moment. Here we capture the current moment at runtime. 
	      );
	}
	
	public static void getDaylightSavingTime() {
		Calendar calendar = Calendar.getInstance();
		int year = calendar.get(Calendar.YEAR);
		ZoneId zone = ZoneId.of(BELGIUM_ZONE_ID);
		ZoneRules zoneRule = zone.getRules();
		zoneRule.getTransitionRules().forEach(rule -> System.out.println(rule.createTransition(year)));
	}
	
	public static int getCurrentHour(Date date, String timeZoneId) {
        // Belgium/Brussels Time
        Calendar calendar = new GregorianCalendar(TimeZone.getTimeZone(timeZoneId));
        calendar.setTimeInMillis(date.getTime());

        return calendar.get(Calendar.HOUR_OF_DAY);
    }
	
	public static Date getDateOfString(String dateInString) {
		Date date = null;
        try {
            date = formatter.parse(dateInString);
        } catch (ParseException e) {
        	logger.error(e.getMessage(), e);
        }
        return date;
	}
}
