package javacore.algorithm.leetcode.under400;

/*
 * LeetCode 342
*/
public class PowerOfFour {
	public boolean isPowerOfFour(int n) {
		if (n <= 0)
			return false;
		while (n % 4 == 0) {
			n /= 4;
		}
		return n == 1;
	}
}
