package javacore.algorithm.leetcode.under0200;

/*
 *  LeetCode 172. Factorial Trailing Zeroes
 */
public class FactorialTrailingZeroes {
	public int trailingZeroes(int n) {
		int countFive = n / 5;
		int temp;
		for (int i = 25; i <= n; i += 25) {
			countFive++;
			temp = i / 25;
			while (temp % 5 == 0) {
				countFive++;
				temp /= 5;
			}
		}
		return countFive;
	}
}
