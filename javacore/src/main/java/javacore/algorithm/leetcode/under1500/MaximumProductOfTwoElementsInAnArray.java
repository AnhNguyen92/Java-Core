package javacore.algorithm.leetcode.under1500;

import java.util.Arrays;

/*
 * LeetCode 1464
 */
public class MaximumProductOfTwoElementsInAnArray {
	public int maxProduct(int[] nums) {
		int n = nums.length;
		if (n == 2) {
			return (nums[0] - 1) * (nums[1] - 1);
		}
		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			if (nums[i] > max) {
				secondMax = max;
				max = nums[i];
			} else if (nums[i] > secondMax) {
				secondMax = nums[i];
			}
		}
		return (max - 1) * (secondMax - 1);
	}
	
	public int maxProduct1(int[] nums) {
        Arrays.sort(nums);
        return (nums[nums.length- 1] - 1) * (nums[nums.length- 2] - 1);
    }
}