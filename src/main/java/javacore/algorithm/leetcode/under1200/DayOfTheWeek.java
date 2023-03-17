package javacore.algorithm.leetcode.under1200;

/*
 * LeetCode 1185. Day of the Week
 */
public class DayOfTheWeek {
	public String dayOfTheWeek(int day, int month, int year) {
		if (month < 3) {
			month += 12;
			year--;
		}
		int index = (int) (day + ((month + 1) * 2.6) + year + (year / 4) + 6 * (year / 100) + (year / 400) + 6) % 7;
		String[] arr = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
		return arr[index];
	}
}
