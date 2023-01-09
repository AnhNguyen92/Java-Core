package javacore.algorithm.leetcode.under2300;

/*
 * LeetCode 2224. Minimum Number of Operations to Convert Time
*/
public class MinimumNumberOfOperationsToConvertTime {
	public int convertTime(String current, String correct) {
		int currTime = parseTimeStr(current);
		int correctTime = parseTimeStr(correct);
		int count = 0;
		int diff = correctTime - currTime;
		int n = diff / 60;
		count += n;
		diff -= n * 60;
		n = diff / 15;
		count += n;
		diff -= n * 15;
		n = diff / 5;
		count += n;
		diff -= n * 5;
		return count + diff;

	}

	private int parseTimeStr(String timeStr) {
		String[] split = timeStr.split(":");
		int time = 0;
		time += Integer.parseInt(split[0]) * 60;
		time += Integer.parseInt(split[1]);
		return time;
	}
}
