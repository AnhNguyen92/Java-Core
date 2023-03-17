package javacore.algorithm.leetcode.under2300;

/*
 * LeetCode 2256. Minimum Average Difference
 */
public class MinimumAverageDifference {
	public int minimumAverageDifference(int[] nums) {
		int n = nums.length;
		if (n == 0) {
			return 0;
		}
		long[] preSum = new long[n];
		preSum[0] += nums[0];
		for (int i = 1; i < n; i++) {
			preSum[i] += nums[i] + preSum[i - 1];
		}
		long min = preSum[n - 1] / n;
		int ans = n - 1;
		long diff;
		for (int i = 0; i < n - 1; i++) {
			diff = Math.abs(preSum[i] / (i + 1) - (preSum[n - 1] - preSum[i]) / (n - i - 1));
			if (diff < min) {
				min = diff;
				ans = i;
			} else if (diff == min && ans > i) {
				ans = i;
			}
		}
		return ans;
	}
}
