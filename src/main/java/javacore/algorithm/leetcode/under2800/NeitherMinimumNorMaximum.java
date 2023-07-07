package javacore.algorithm.leetcode.under2800;

import java.util.Arrays;

/*
 * LeetCode 2733. Neither Minimum nor Maximum
 */
public class NeitherMinimumNorMaximum {
	public int findNonMinOrMax(int[] nums) {
		if (nums.length <= 2)
			return -1;
		Arrays.sort(nums);
		if (nums[1] == nums[0] || nums[1] == nums[nums.length - 1])
			return -1;
		return nums[1];
	}
}