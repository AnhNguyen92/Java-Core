package javacore.algorithm.leetcode.under1200;

/*
 * LeetCode 1137. N-th Tribonacci Number
 */
public class NthTribonacciNumber {
	public int tribonacci(int n) {
		if (n == 0)
			return 0;
		if (n == 1)
			return 1;
		if (n == 2)
			return 1;
		int[] a = new int[n + 1];
		a[0] = 0;
		a[1] = 1;
		a[2] = 1;
		for (int i = 3; i < a.length; i++) {
			a[i] = a[i - 1] + a[i - 2] + a[i - 3];
		}

		return a[n];
	}
}
