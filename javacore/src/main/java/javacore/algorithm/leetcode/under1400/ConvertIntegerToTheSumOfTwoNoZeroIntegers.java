package javacore.algorithm.leetcode.under1400;

/*
 * LeetCode 1317
 */
public class ConvertIntegerToTheSumOfTwoNoZeroIntegers {
	public int[] getNoZeroIntegers(int n) {
		for (int i = 1; i <= n; i++) {
			if (noZeroInteger(i) && noZeroInteger(n - i)) {
				return new int[] { i, n - i };
			}
		}
		return new int[] {};
	}

	private boolean noZeroInteger(int n) {
		while (n > 0) {
			if (n % 10 == 0)
				return false;
			n /= 10;
		}
		return true;
	}
}
