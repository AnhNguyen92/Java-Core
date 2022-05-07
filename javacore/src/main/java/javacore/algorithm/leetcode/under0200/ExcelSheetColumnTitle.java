package javacore.algorithm.leetcode.under0200;

/*
 * LeetCode 168
 */
public class ExcelSheetColumnTitle {
	public String convertToTitle(int n) {
		// @formatter:off
		String[] arr = new String[] {
				"", "A", "B",  "C", "D",
				"E", "F", "G", "H", "I",
				"J", "K", "L", "M", "N",
				"O", "P", "Q", "R",  "S",
				"T", "U", "V", "W", "X",
				"Y",  "Z"};
		// @formatter:on

		StringBuilder ans = new StringBuilder("");
		if (n < arr.length)
			return arr[n];
		while (n > 26) {
			int reminder = n % 26;
			if (reminder == 0) {
				reminder = 26;
			}
			ans.append(arr[reminder]);
			n = (n - reminder) / 26;
		}
		ans.append(arr[n]);

		return ans.reverse().toString();
	}
}
