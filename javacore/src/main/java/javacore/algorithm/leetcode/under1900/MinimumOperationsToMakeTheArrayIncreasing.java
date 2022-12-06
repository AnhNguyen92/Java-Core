package javacore.algorithm.leetcode.under1900;

/*
 * Leetcode 1827. Minimum Operations to Make the Array Increasing
 */
public class MinimumOperationsToMakeTheArrayIncreasing {
	public int minOperations(int[] nums) {
		int curNo = nums[0];
		int sum = 0;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] <= curNo) {
				curNo++;
				sum += curNo - nums[i];
			} else {
				curNo = nums[i];
			}
		}
		return sum;
	}
}
