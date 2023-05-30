package javacore.algorithm.leetcode.under0400;

/*
 * LeetCode 343. Integer Break
 */
public class IntegerBreak {
	public int integerBreak(int n) {
		if (n == 2)
			return 1;
		if (n == 3)
			return 2;
		int prod = 1;
		while (n > 3 && n > 4) {
			prod *= 3;
			n -= 3;
		}
		while (n % 2 == 0) {
			prod *= 2;
			n /= 2;
		}

		return prod * n;
	}
}
