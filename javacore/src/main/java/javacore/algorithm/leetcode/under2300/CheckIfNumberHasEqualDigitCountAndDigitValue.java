package javacore.algorithm.leetcode.under2300;

/*
 * LeetCode 2283. Check if Number Has Equal Digit Count and Digit Value
 */
public class CheckIfNumberHasEqualDigitCountAndDigitValue {
	public boolean digitCount(String num) {
		int[] arr = new int[10];
		for (char c : num.toCharArray()) {
			arr[c - '0']++;
		}
		for (int i = 0; i < num.length(); i++) {
			if (arr[i] != num.charAt(i) - '0')
				return false;
		}
		return true;
	}
}
