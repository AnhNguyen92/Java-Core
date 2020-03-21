package vn.com.ids.javacore.datetime;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.zone.ZoneRules;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.TimeZone;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import vn.com.ids.javacore.core.DashboardConstant;
import vn.com.ids.javacore.model.PublicHoliday;

/**
 * @author manlyhumg
 *
 */

public class DateUtil {
	private static final Logger logger = LoggerFactory.getLogger(DateUtil.class);
    private static final SimpleDateFormat formatter = new SimpleDateFormat("HH:mm dd/MM/yyyy");
	private static final String BASE_PUBLIC_HOLIDAY_URL = "https://kayaposoft.com/enrico/json/v2.0";

	public static void getFirtDateOfWeekInYear(int weekOfyear) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd MM yyyy");
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.WEEK_OF_YEAR, weekOfyear);
		cal.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
		System.out.println(sdf.format(cal.getTime()));
	}

	// https://stackoverflow.com/questions/1060479/determine-whether-daylight-savings-time-dst-is-active-in-java-for-a-specified
	public static boolean isDaylightSavingTime() {
		return ZoneId.of(DashboardConstant.BELGIUM_ZONE_ID) // Represent a specific time zone, the history of past, present, and future
											// changes to the offset-from-UTC used by the people of a certain region.
				.getRules() // Obtain the list of those changes in offset.
				.isDaylightSavings( // See if the people of this region are observing Daylight Saving Time at a
									// specific moment.
						Instant.now() // Specify the moment. Here we capture the current moment at runtime.
				);
	}

	/**
	 * 
	 */
	public static void getDaylightSavingTime() {
		Calendar calendar = Calendar.getInstance();
		int year = calendar.get(Calendar.YEAR);
		ZoneId zone = ZoneId.of(DashboardConstant.BELGIUM_ZONE_ID);
		ZoneRules zoneRule = zone.getRules();
		zoneRule.getTransitionRules().forEach(rule -> System.out.println(
				rule.createTransition(year).getDateTimeBefore().format(DateTimeFormatter.ofPattern("dd-MMM-yy"))));
	}

	public static int getCurrentHour(Date date, String timeZoneId) {
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
	
	public static int getCurrentYear() {
	    return LocalDate.now().getYear();
	}
	
	public static int getCurrentMonth() {
	    return LocalDate.now().getMonthValue();
	}
	
	public static LocalDate getTomorrow() {
	    return LocalDate.now().plusDays(1);
	}
	
	public static boolean isTomorrowDate(Date compareDate) {
	    return compareDate.toInstant()
	            .atZone(ZoneId.systemDefault())
	            .toLocalDate().equals(getTomorrow());
	}
	
	/**
	 * @param countryCode
	 * @param month
	 * @return list public day in month of specific country.
	 * @see See list of country code in {@link} https://en.wikipedia.org/wiki/ISO_3166-1_alpha-3.
	 * All available of supported country in {@link} "https://kayaposoft.com/enrico/json/v2.0/?action=getSupportedCountries"n 
	 *  List
	 */
	public static List<PublicHoliday> getPublicDayThisMonth(String countryCode) {
	    logger.info("start process get public day");
	    List<PublicHoliday> publicHolidays = new ArrayList<PublicHoliday>();
	    try {
	        String urlParam = "?action=getHolidaysForMonth&month="+ getCurrentMonth() + "&year=" + getCurrentYear() //
	                         + "&country=" + countryCode + "&holidayType=public_holiday";
            URL url = new URL(BASE_PUBLIC_HOLIDAY_URL + urlParam);
            ObjectMapper objectMapper = new ObjectMapper();
            try {
                publicHolidays = objectMapper.readValue(url, new TypeReference<List<PublicHoliday>>(){});
            } catch (JsonParseException e) {
                logger.error(e.getMessage(), e);
            } catch (JsonMappingException e) {
                logger.error(e.getMessage(), e);
            } catch (IOException e) {
                logger.error(e.getMessage(), e);
            }
        } catch (MalformedURLException e) {
            logger.error(e.getMessage(), e);
        }
	    logger.info("end process get public day");
	    
	    return publicHolidays;
	}
	
	public static boolean isDayBeforeDayLightSavingTime() {
        Instant instant = Instant.now();
        return ZoneId.of(DashboardConstant.BELGIUM_ZONE_ID).getRules().isDaylightSavings(instant.plus( 1 , ChronoUnit.DAYS ));
    }
}
