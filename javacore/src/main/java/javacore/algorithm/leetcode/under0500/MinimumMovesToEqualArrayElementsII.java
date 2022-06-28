package javacore.algorithm.leetcode.under0500;

import java.util.Arrays;

/*
 * Leetcode 462
 */
public class MinimumMovesToEqualArrayElementsII {
	public int minMoves2(int[] nums) {
		Arrays.sort(nums);
		int k = nums.length / 2;
		int count = 0;
		for (int i : nums) {
			count += Math.abs(i - nums[k]);
		}
		return count;
	}
}
