package javacore.algorithm.leetcode.under0051;

import java.util.Arrays;

/*
 * LeetCode 31
*/
public class NextPermutation {
	public void nextPermutation(int[] nums) {
		boolean found = false;
		for (int i = nums.length - 2; i >= 0; i--) {
			if (!found) {
				int min = 101;
				int idx = i;
				for (int j = i + 1; j <= nums.length - 1; j++) {
					if (nums[j] > nums[i] && nums[j] < min) {
						min = nums[j];
						idx = j;
						found = true;
					}
				}
				if (found) {
					int temp = nums[i];
					nums[i] = nums[idx];
					nums[idx] = temp;
					Arrays.sort(nums, i + 1, nums.length);
				}
			}
		}
		if (!found)
			Arrays.sort(nums);
	}
}
