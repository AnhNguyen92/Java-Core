package javacore.algorithm.leetcode.under0600;

/*
 * LeetCode 540. Single Element in a Sorted Array
 */
public class SingleElementInASortedArray {
	public int singleNonDuplicate(int[] nums) {
		int left = 0;
		int right = nums.length - 1;
		while (left < right) {
			if (nums[left] == nums[left + 1]) {
				left += 2;
			} else {
				return nums[left];
			}
			if (nums[right] == nums[right - 1]) {
				right -= 2;
			} else {
				return nums[right];
			}
		}
		return nums[(left + right) / 2];
	}
}
