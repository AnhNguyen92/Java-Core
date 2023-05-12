package javacore.algorithm.leetcode.under2600;

/*
 * LeetCode 2549. Count Distinct Numbers on Board
 */
public class CountDistinctNumbersOnBoard {
	public int distinctIntegers(int n) {
		if (n == 1) {
			return 1;
		}
		return n - 1;
	}
}
