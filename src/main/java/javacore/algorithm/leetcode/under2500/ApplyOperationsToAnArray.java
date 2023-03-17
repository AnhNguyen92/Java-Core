package javacore.algorithm.leetcode.under2500;

/*
 * LeetCode 2460. Apply Operations to an Array
 */
public class ApplyOperationsToAnArray {
	public int[] applyOperations(int[] nums) {
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == nums[i + 1]) {
				nums[i] *= 2;
				nums[i + 1] = 0;
				i++;
			}
		}
		int[] ans = new int[nums.length];
		int i = 0;
		for (int j = 0; j < nums.length; j++) {
			if (nums[j] > 0) {
				ans[i++] = nums[j];
			}
		}
		return ans;
	}
}
