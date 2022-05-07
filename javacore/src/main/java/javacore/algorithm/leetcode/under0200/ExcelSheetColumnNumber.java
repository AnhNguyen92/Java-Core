package javacore.algorithm.leetcode.under0200;

/*
 * LeetCode 171
 */
public class ExcelSheetColumnNumber {
	public int titleToNumber(String s) {
		int sum = 0;
		for (char c : s.toCharArray()) {
			sum = sum * 26 + (1 + (c - 'A'));
		}
		return sum;
	}
}
