package javacore.algorithm.leetcode.under51;

import java.util.Arrays;

/*
 * LeetCode 41
 */
public class FirstMissingPositive {
	public int firstMissingPositive(int[] nums) {
		Arrays.sort(nums);
		int missing = 1;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == missing) {
				missing++;
			}
		}
		return missing;
	}
}
