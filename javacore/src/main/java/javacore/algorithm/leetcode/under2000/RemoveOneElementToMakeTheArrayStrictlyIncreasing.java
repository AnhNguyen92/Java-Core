package javacore.algorithm.leetcode.under2000;

/*
 * LeetCode 1909
 */
public class RemoveOneElementToMakeTheArrayStrictlyIncreasing {
	public boolean canBeIncreasing(int[] nums) {
		int skip = 0;
		int count = 0;
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] >= nums[i + 1]) {
				skip = i;
				count++;
			}
		}
		if (count == 0) {
			return true;
		}
		if (count > 1) {
			return false;
		}
		return testIncrease(nums, skip) || testIncrease(nums, skip + 1);
	}

	private boolean testIncrease(int[] nums, int skip) {
		int start = (skip == 0) ? 2 : 1;
		int prev = (skip == 0) ? 1 : 0;
		for (int i = start; i <= nums.length - 1; i++) {
			if (i != skip) {
				if (nums[prev] >= nums[i])
					return false;
				prev = i;
			}

		}
		return true;
	}
}
