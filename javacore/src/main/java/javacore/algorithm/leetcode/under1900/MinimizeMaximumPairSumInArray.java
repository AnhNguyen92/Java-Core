package javacore.algorithm.leetcode.under1900;

import java.util.Arrays;

/*
 * LeetCode 1877. Minimize Maximum Pair Sum in Array
 */
public class MinimizeMaximumPairSumInArray {
	public int minPairSum(int[] nums) {
		Arrays.sort(nums);
		int max = 0;
		int n = nums.length;
		for (int i = 0; i < n / 2; i++) {
			if (nums[i] + nums[n - 1 - i] > max) {
				max = nums[i] + nums[n - 1 - i];
			}
		}
		return max;
	}
}
