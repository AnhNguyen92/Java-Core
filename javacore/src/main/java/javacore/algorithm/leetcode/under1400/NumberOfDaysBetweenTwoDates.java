package javacore.algorithm.leetcode.under1400;

/*
 * LeetCode 1360
 */
public class NumberOfDaysBetweenTwoDates {
	public int daysBetweenDates(String date1, String date2) {
		return Math.abs(dayFrom1970(date2) - dayFrom1970(date1));
	}

	private int dayFrom1970(String date) {
		String[] arr = date.split("-");
		int year = Integer.parseInt(arr[0]);
		int month = Integer.parseInt(arr[1]);
		int day = Integer.parseInt(arr[2]);

		int count = 0;
		for (int i = 1970; i < year; i++) {
			count += 365;
			if (isLeapYear(i)) {
				count++;
			}
		}
		for (int i = 1; i < month; i++) {
			if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {
				count += 31;
			} else if (i == 2) {
				count += 28;
				if (isLeapYear(year)) {
					count++;
				}
			} else {
				count += 30;
			}

		}

		return count + day;
	}

	private boolean isLeapYear(int year) {
		return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
	}
}
