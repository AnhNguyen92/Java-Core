package javacore.algorithm.leetcode.under2500;

/*
 * LeetCode 2481. Minimum Cuts to Divide a Circle
 */
public class MinimumCutsToDivideACircle {
	public int numberOfCuts(int n) {
		if (n == 1)
			return 0;
		if (n % 2 == 0)
			return n / 2;
		return n;
	}
}
