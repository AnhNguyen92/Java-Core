package javacore.algorithm.leetcode.under2800;

/*
 * LeetCode 2710. Remove Trailing Zeros From a String
 */
public class RemoveTrailingZerosFromAString {
	public String removeTrailingZeros(String num) {
		int i = num.length();
		while (i > 0 && num.charAt(i - 1) == '0') {
			i--;
		}
		if (i <= 0) {
			return "0";
		}
		return num.substring(0, i);
	}
}
