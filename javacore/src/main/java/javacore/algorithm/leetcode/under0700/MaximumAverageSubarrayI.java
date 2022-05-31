package javacore.algorithm.leetcode.under0700;

/*
 * LeetCode 643
 */
public class MaximumAverageSubarrayI {
	public double findMaxAverage(int[] nums, int k) {
		int sum = 0;
		for (int i = 0; i < k; i++) {
			sum += nums[i];
		}
		int temp = sum;
		for (int i = k; i <= nums.length - 1; i++) {
			temp += nums[i] - nums[i - k];
			if (sum < temp)
				sum = temp;
		}
		return (double) sum / k;
	}
}
