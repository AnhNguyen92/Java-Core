package javacore.algorithm.leetcode.under0400;

/*
 * LeetCode 357. Count Numbers with Unique Digits
*/
public class CountNumbersWithUniqueDigits {
	public int countNumbersWithUniqueDigits1(int n) {
		int[] unique = { 1, 10, 91, 739, 5275, 32491, 168571, 712891, 2345851 };
		return unique[n];
	}

	public int countNumbersWithUniqueDigits(int n) {
		int ans = 1;
		for (int i = 1; i <= n; i++) {
			int digit = 9;
			int count = 1;
			for (int j = 1; j < i; j++, digit--) {
				count *= digit;
			}
			ans += 9 * count;
		}
		return ans;
	}
}
