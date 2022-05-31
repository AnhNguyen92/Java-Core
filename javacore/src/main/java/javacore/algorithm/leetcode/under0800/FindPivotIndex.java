package javacore.algorithm.leetcode.under0800;

/*
 * LeetCode 724
 */
public class FindPivotIndex {
	public int pivotIndex(int[] nums) {
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
		}
		int index = -1;
		int leftSum = 0;
		for (int i = 0; i < nums.length; i++) {

			if (leftSum == (sum - nums[i] - leftSum))
				return i;
			else
				leftSum += nums[i];
		}

		return index;
	}
}
