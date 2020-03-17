package vn.com.ids.javacore;

import java.util.Date;

import vn.com.ids.javacore.datetime.DateUtil;

public class App {
	public static void main(String[] args) {
		DateUtil.getFirtDateOfWeekInYear(11);

		String dateInString = "9:00 29/03/2020";
		Date date = DateUtil.getDateOfString(dateInString);
		int hcmHour = DateUtil.getCurrentHour(date, "Asia/Ho_Chi_Minh");
		int belgiumHour = DateUtil.getCurrentHour(date, "Europe/Brussels");
		System.out.println("Date: " + date);
		System.out.println("HCM hour:" + hcmHour + "\t Belgium hour: " + belgiumHour);

		System.out.println(DateUtil.isDaylightSavingTime());

		DateUtil.getDaylightSavingTime();
		
	}

}
