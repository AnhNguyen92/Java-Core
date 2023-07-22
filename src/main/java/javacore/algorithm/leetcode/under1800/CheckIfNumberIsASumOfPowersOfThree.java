package javacore.algorithm.leetcode.under1800;

/*
 * LeetCode 1780. Check if Number is a Sum of Powers of Three
 */
public class CheckIfNumberIsASumOfPowersOfThree {
	public boolean checkPowersOfThree(int n) {
		if (n == 2) {
			return false;
		}
		if (n == 1 || n == 3) {
			return true;
		}
		int x = 3;
		while (x * 3 <= n) {
			x *= 3;
		}
		if (x < n) {
			if (n - x >= x) {
				return false;
			}
			return checkPowersOfThree(n - x);
		}
		return true;
	}
}
