package javacore.algorithm.leetcode.under0400;

/*
 * LeetCode 397. Integer Replacement
*/
public class IntegerReplacement {
	public int integerReplacement(int n) {
		return countIntegerReplacement(n, 0);
	}

	private int countIntegerReplacement(int n, int count) {
		if (n == 1)
			return count;
		if (n % 2 == 0) {
			return countIntegerReplacement(n / 2, count + 1);
		}
		if (n == 2147483647) {
			return countIntegerReplacement(n / 2 - 1, count + 1);
		}
		return Math.min(countIntegerReplacement(n - 1, count + 1), countIntegerReplacement(n + 1, count + 1));
	}
}
