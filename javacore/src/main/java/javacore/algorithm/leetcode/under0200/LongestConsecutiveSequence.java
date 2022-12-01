package javacore.algorithm.leetcode.under0200;

import java.util.Arrays;

/*
 *  Leetcode 128. Longest Consecutive Sequence
 */
public class LongestConsecutiveSequence {

	public int longestConsecutive(int[] nums) {
		Arrays.sort(nums);
		int count = 0;
		int ans = 0;
		for (int i = 0; i < nums.length; i++) {
			if (i == 0 || nums[i] - nums[i - 1] > 1) {
				count = 1;
			} else if (nums[i] - nums[i - 1] == 1) {
				count++;
			}
			ans = Math.max(ans, count);
		}
		return ans;
	}
}
