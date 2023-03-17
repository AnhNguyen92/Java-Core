package javacore.algorithm.leetcode.under1600;

/*
 * LeetCode 1551. Minimum Operations to Make Array Equal
 */
public class MinimumOperationsToMakeArrayEqual {
	public int minOperations(int n) {
		int count = 0;
		for (int i = 0; i < n / 2; i++) {
			count += n - 2 * i - 1;
		}
		return count;
	}

	public int minOperations2(int n) {
		return (n / 2) * n - (n / 2) * (n / 2);
	}
}
