package javacore.algorithm.leetcode.under2500;

/*
 * LeetCode 2409. Count Days Spent Together
 */
public class CountDaysSpentTogether {
	int[] daysInMonth = new int[] { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
		int startAlice = convertMMDDStrToNum(arriveAlice);
		int endAlice = convertMMDDStrToNum(leaveAlice);
		int startBob = convertMMDDStrToNum(arriveBob);
		int endBob = convertMMDDStrToNum(leaveBob);
		int start = Math.max(startAlice, startBob);
		int end = Math.min(endAlice, endBob);
		if (start > end) {
			return 0;
		}
		return (end - start + 1);
	}

	private int convertMMDDStrToNum(String dateStr) {
		String[] arr = dateStr.split("-");
		int month = Integer.valueOf(arr[0]);
		int total = Integer.valueOf(arr[1]);
		for (int i = 0; i < month - 1; i++) {
			total += daysInMonth[i];
		}

		return total;
	}
}
