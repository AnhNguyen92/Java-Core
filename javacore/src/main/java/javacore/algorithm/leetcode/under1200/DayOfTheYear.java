package javacore.algorithm.leetcode.under1200;

/*
 * LeetCode 1154. Day of the Year
 */
public class DayOfTheYear {
	public int dayOfYear(String date) {
		int[] dayInMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		String[] dayArr = date.split("-");
		int month = Integer.parseInt(dayArr[1]);
		int day = Integer.parseInt(dayArr[2]);
		int year = Integer.parseInt(dayArr[0]);
		if (month == 1)
			return day;
		int dayInYear = day;
		for (int i = 0; i < month - 1; i++) {
			dayInYear += dayInMonth[i];
		}
		if (month > 2 && isLeapYear(year)) {
			dayInYear += 1;
		}
		return dayInYear;
	}

	public boolean isLeapYear(int year) {
		return ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
	}
}
