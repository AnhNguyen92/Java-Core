package javacore.algorithm.leetcode.under0200;

/*
 * LeetCode 152. Maximum Product Subarray
 */
public class MaximumProductSubarray {
	public int maxProduct(int[] nums) {
		int min = nums[0];
		int max = nums[0];
		int maxProdSub = nums[0];
		for (int i = 1; i < nums.length; i++) {
			int temp = Math.max(nums[i], Math.max(nums[i] * min, nums[i] * max));
			min = Math.min(nums[i], Math.min(nums[i] * min, nums[i] * max));
			max = temp;
			maxProdSub = Math.max(maxProdSub, max);
		}
		return maxProdSub;
	}
}
