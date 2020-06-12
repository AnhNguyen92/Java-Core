package vn.com.ids.javacore;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import vn.com.ids.javacore.datetime.DateUtil;

public class App {
	public static void main(String[] args) {
		Logger logger = LoggerFactory.getLogger(App.class);
		DateUtil.getFirtDateOfWeekInYear(11);

		String dateInString = "9:00 29/03/2020";
		Date date = DateUtil.getDateOfString(dateInString);
		int hcmHour = DateUtil.getCurrentHour(date, "Asia/Ho_Chi_Minh");
		int belgiumHour = DateUtil.getCurrentHour(date, "Europe/Brussels");
		logger.info("Date: {}", date);
		logger.info("HCM hour: {}\t Belgium hour: {}", hcmHour, belgiumHour);

		logger.info("{}", DateUtil.isDaylightSavingTime());

		DateUtil.getDaylightSavingTime();
		logger.info("Current week of year: {}", DateUtil.getCurrentWeekOfYear());
	}

}
