package javacore.algorithm.leetcode.under1500;

/*
 * LeetCode 1413. Minimum Value to Get Positive Step by Step Sum
 */
public class MinimumValueToGetPositiveStepByStepSum {
	public int minStartValue(int[] nums) {
		int startValue = 1;
		int sum = startValue;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
			if (sum < 1) {
				startValue += 1 - sum;
				sum = 1;
			}
		}
		return startValue;
	}
}
