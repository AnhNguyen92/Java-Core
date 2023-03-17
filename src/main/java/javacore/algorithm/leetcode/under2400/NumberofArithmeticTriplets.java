package javacore.algorithm.leetcode.under2400;

/*
 * LeetCode 2367. Number of Arithmetic Triplets
 */
public class NumberofArithmeticTriplets {
	public int arithmeticTriplets(int[] nums, int diff) {
		int[] values = new int[201];
		int count = 0;
		for (int i : nums) {
			values[i] = 1;
		}
		for (int i = 0; i <= 200 - 2 * diff; i++) {
			if (values[i] > 0 && values[i + diff] > 0 && values[i + 2 * diff] > 0) {
				count++;
			}
		}
		return count;
	}
}
