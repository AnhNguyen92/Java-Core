package javacore.algorithm.leetcode.under2800;

/*
 * LeetCode 2760. Longest Even Odd Subarray With Threshold
 */
public class LongestEvenOddSubarrayWithThreshold {
	public int longestAlternatingSubarray(int[] nums, int threshold) {
		int ans = 0;
		int count = 0;
		int r = nums[0] % 2;
		int r1;
		for (int i = 0; i < nums.length; i++) {
			r1 = r;
			r = nums[i] % 2;
			if (count > 0 && nums[i] <= threshold && r != r1) {
				count++;
			} else {
				ans = Math.max(count, ans);
				count = 0;
				if (nums[i] <= threshold && r == 0) {
					count = 1;
				}
			}
		}
		return Math.max(count, ans);
	}
}
