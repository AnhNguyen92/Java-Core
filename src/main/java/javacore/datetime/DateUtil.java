package javacore.datetime;

import java.io.IOException;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.YearMonth;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.WeekFields;
import java.time.zone.ZoneRules;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import javacore.constant.DashboardConstant;
import javacore.model.PublicHoliday;

/**
 * @author manlyhumg
 */

public class DateUtil {
	private static final Logger logger = LoggerFactory.getLogger(DateUtil.class);

	private DateUtil() {
		throw new IllegalStateException("Utility class");
	}

	public static void getFirtDateOfWeekInYear(int weekOfyear) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd MM yyyy");
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.WEEK_OF_YEAR, weekOfyear);
		cal.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
		if (logger.isDebugEnabled()) {
			logger.info("Firt Date Of Specific Week In Year {}", sdf.format(cal.getTime()));
		}
	}

	// https://stackoverflow.com/questions/1060479/determine-whether-daylight-savings-time-dst-is-active-in-java-for-a-specified
	public static boolean isDaylightSavingTime() {
		return ZoneId.of(DashboardConstant.BELGIUM_ZONE_ID) // Represent a specific time zone, the history of past,
															// present, and future
				// changes to the offset-from-UTC used by the people of a certain region.
				.getRules() // Obtain the list of those changes in offset.
				.isDaylightSavings( // See if the people of this region are observing Daylight Saving Time at a
									// specific moment.
						Instant.now() // Specify the moment. Here we capture the current moment at runtime.
				);
	}

	public static void getDaylightSavingTime() {
		Calendar calendar = Calendar.getInstance();
		int year = calendar.get(Calendar.YEAR);
		ZoneId zone = ZoneId.of(DashboardConstant.BELGIUM_ZONE_ID);
		ZoneRules zoneRule = zone.getRules();
		zoneRule.getTransitionRules().forEach(rule -> logger.info(
				rule.createTransition(year).getDateTimeBefore().format(DateTimeFormatter.ofPattern("dd-MMM-yy"))));
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
			SimpleDateFormat formatter = new SimpleDateFormat("HH:mm dd/MM/yyyy");
			date = formatter.parse(dateInString);
		} catch (ParseException e) {
			logger.error(e.getMessage(), e);
		}
		return date;
	}

	public static int getCurrentHour(String timeZoneId) {
		return LocalTime.now(ZoneId.of(timeZoneId)).getHour();
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
		return compareDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate().equals(getTomorrow());
	}

	public static boolean isDayBeforeDayLightSavingTime() {
		Instant instant = Instant.now();
		return ZoneId.of(DashboardConstant.BELGIUM_ZONE_ID).getRules()
				.isDaylightSavings(instant.plus(1, ChronoUnit.DAYS));
	}

	public static LocalDate getLastSunDay() {
		return YearMonth.of(LocalDate.now().getYear(), LocalDate.now().getMonth()) // Represent the entirety of a
																					// specified month.
				.atEndOfMonth() // Get the date of the last day of that month.
				.with(TemporalAdjusters.previousOrSame(DayOfWeek.SUNDAY));
	}

	public static int getCurrentWeekOfYear() {
		Locale userLocale = Locale.getDefault();
		WeekFields weekNumbering = WeekFields.of(userLocale);
		LocalDate date = LocalDate.now();

		return date.get(weekNumbering.weekOfWeekBasedYear());
	}

	public static PublicHoliday getHoliday(LocalDate fromDate) {
		logger.info("start check public date in Belgium");
		List<PublicHoliday> publicHolidays = new ArrayList<>();
		PublicHoliday result = null;
		ObjectMapper mapper = new ObjectMapper();

		try {
			String dateFormat = "dd-MM-yyyy";
			String urlParam = "?action=getHolidaysForDateRange&fromDate="
					+ fromDate.format(DateTimeFormatter.ofPattern(dateFormat)) + "&toDate="
					+ fromDate.format(DateTimeFormatter.ofPattern(dateFormat))
					+ "&country=bel&region=be&holidayType=public_holiday";
			URL url = new URL(DashboardConstant.DAY_LIGHT_BASE_URL + urlParam);
			publicHolidays = mapper.readValue(url, new TypeReference<List<PublicHoliday>>() {
			});
			if (!publicHolidays.isEmpty()) {
				result = publicHolidays.get(0);
			}
		} catch (IOException e) {
			logger.info(e.getMessage(), e);
		}

		logger.info("check public date in Belgium done.");

		return result;
	}
}
