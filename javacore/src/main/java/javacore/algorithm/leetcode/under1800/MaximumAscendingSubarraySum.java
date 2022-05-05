package javacore.algorithm.leetcode.under1800;

/*
 * Leetcode 1800
 */
public class MaximumAscendingSubarraySum {
	public int maxAscendingSum(int[] nums) {
		int max = nums[0];
		int i = 1;
		int sum = nums[0];
		while (i < nums.length) {
			if (nums[i - 1] < nums[i]) {
				sum += nums[i];
			} else {
				max = (max > sum) ? max : sum;
				sum = nums[i];
			}
			i++;
		}
		return (sum > max) ? sum : max;
	}
}
