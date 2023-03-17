package javacore.algorithm.leetcode.under0700;

/*
 * LeetCode 674. Longest Continuous Increasing Subsequence
 */
public class LongestContinuousIncreasingSubsequence {
	public int findLengthOfLCIS(int[] nums) {
		int ans = 0;
		int anchor = 0;
		for (int i = 0; i < nums.length; ++i) {
			if (i > 0 && nums[i - 1] >= nums[i])
				anchor = i;
			ans = Math.max(ans, i - anchor + 1);
		}
		return ans;
	}
}
