package javacore.algorithm.leetcode.under0700;

import java.util.Arrays;

/*
 * LeetCode 628. Maximum Product of Three Numbers
 */
public class MaximumProductOfThreeNumbers {
	public int maximumProduct(int[] nums) {
		Arrays.sort(nums);
		int max = nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3];
		if (nums[0] < 0 && nums[1] < 0 && nums[0] * nums[1] * nums[nums.length - 1] > max) {
			max = nums[0] * nums[1] * nums[nums.length - 1];
		}
		return max;
	}
}
