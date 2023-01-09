package javacore.algorithm.leetcode.under2500;

import java.util.Arrays;

/*
 *LeetCode 2441. Largest Positive Integer That Exists With Its Negative
 */
public class LargestPositiveIntegerThatExistsWithItsNegative {
	public int findMaxK(int[] nums) {
		Arrays.sort(nums);
		int start = 0;
		int end = nums.length - 1;
		int sum = nums[start] + nums[end];
		while (sum != 0 && start < end) {
			if (sum > 0) {
				end--;
			} else {
				start++;
			}
			sum = nums[start] + nums[end];
		}
		if (start == end) {
			return -1;
		}
		return nums[end];
	}
}
