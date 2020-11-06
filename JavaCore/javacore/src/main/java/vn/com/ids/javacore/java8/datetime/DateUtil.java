package vn.com.ids.javacore.java8.datetime;

import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DateUtil {
	private static final Logger logger = LoggerFactory.getLogger(DateUtil.class);

	public static void main(String[] args) {
		logger.info("{}", format(LocalDate.now(), "yyyy-M-d"));
		logger.info("{}", getMillisecond());
		logger.info("{}", getLastSundayInMonth(Month.OCTOBER, DayOfWeek.SUNDAY));
	}

	// equivalent to System.out.println(new SimpleDateFormat("yyyy-M-d").format(new
	// Date()));
	public static String format(LocalDate date, String pattern) {
		return date.format(DateTimeFormatter.ofPattern(pattern));
	}

	// equivalent to Calendar.getInstance().getTimeInMillis();
	public static long getMillisecond() {
		return Instant.now().toEpochMilli();
	}

	public static LocalDate getLastSundayInMonth(Month month, DayOfWeek dayOfWeek) {
		return YearMonth.of(Year.now().getValue(), month) 		   // Represent the entirety of a specified month.
				.atEndOfMonth() 										   // Get the date of the last day of that month.
				.with(TemporalAdjusters.previousOrSame(dayOfWeek)); // Move to the previous Sunday, or keep if already Sunday.
	}

	public static LocalDate getLastSunDayInMonth() {
		return LocalDate.now().with(TemporalAdjusters.lastInMonth(DayOfWeek.SUNDAY));
	}
	
}
