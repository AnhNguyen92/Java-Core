package javacore.algorithm.leetcode.under1800;

/*
 * LeetCode 1736. Latest Time by Replacing Hidden Digits
 */
public class LatestTimeByReplacingHiddenDigits {
	public String maximumTime(String time) {
		String[] timeArr = time.split(":");
		StringBuilder hour = new StringBuilder(timeArr[0]);
		if (hour.toString().equals("??") || hour.toString().equals("2?")) {
			hour = new StringBuilder("23");
		} else if (hour.charAt(1) == '?') {
			hour.setCharAt(1, '9');
		} else if (hour.charAt(0) == '?') {
			if ((hour.charAt(1) - '0' < 4)) {
				hour.setCharAt(0, '2');
			} else {
				hour.setCharAt(0, '1');
			}
		}
		StringBuilder minute = new StringBuilder(timeArr[1]);
		if (minute.toString().equals("??")) {
			minute = new StringBuilder("59");
		} else if (minute.charAt(1) == '?') {
			minute.setCharAt(1, '9');
		} else if (minute.charAt(0) == '?') {
			minute.setCharAt(0, '5');
		}
		return hour.append(":").append(minute).toString();
	}
}
