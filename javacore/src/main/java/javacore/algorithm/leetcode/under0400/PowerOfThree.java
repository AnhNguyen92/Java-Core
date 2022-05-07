package javacore.algorithm.leetcode.under0400;

/*
 * LeetCode 326
*/
public class PowerOfThree {
	public boolean isPowerOfThree(int n) {
		if (n == 0)
			return false;
		while (n % 3 == 0) {
			n /= 3;
		}
		return n == 1;
	}
}
