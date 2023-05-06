package javacore.algorithm.leetcode.under2700;

/*
 * LeetCode 2656. Maximum Sum With Exactly K Elements
 */
public class MaximumSumWithExactlyKElements {
	public int maximizeSum(int[] nums, int k) {
		int max = nums[0];
		for (int i = 1; i < nums.length; i++) {
			max = Math.max(max, nums[i]);
		}
		return max * k + (k - 1) * k / 2;

	}
}
