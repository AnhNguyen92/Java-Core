package javacore.algorithm.leetcode.under0800;

import java.util.Arrays;

/*
 * LeetCode 747
 */
public class LargestNumberAtLeastTwiceOfOthers {
	public int dominantIndex(int[] nums) {
		if (nums.length == 1)
			return 0;
		int max = nums[0];
		int ans = 0;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] > max) {
				max = nums[i];
				ans = i;
			}
		}
		Arrays.sort(nums);
		if (nums[nums.length - 2] == 0)
			return ans;
		return (nums[nums.length - 1] / nums[nums.length - 2] >= 2) ? ans : -1;
	}

	public int dominantIndex1(int[] nums) {
		int maxIndex = 0;
		for (int i = 0; i < nums.length; ++i) {
			if (nums[i] > nums[maxIndex])
				maxIndex = i;
		}
		for (int i = 0; i < nums.length; ++i) {
			if (maxIndex != i && nums[maxIndex] < 2 * nums[i])
				return -1;
		}
		return maxIndex;
	}
}
