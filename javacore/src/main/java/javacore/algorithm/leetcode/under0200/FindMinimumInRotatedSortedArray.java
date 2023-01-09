package javacore.algorithm.leetcode.under0200;

/*
 * LeetCode 153. Find Minimum in Rotated Sorted Array
 */
public class FindMinimumInRotatedSortedArray {

	public int findMin(int[] nums) {
		int l = 0;
		int r = nums.length - 1;
		int mid;
		while (l < r - 1) {
			mid = (l + r) / 2;
			if (nums[mid] > nums[l] && nums[mid] > nums[r]) {
				l = mid;
			} else {
				r = mid;
			}
		}
		return Math.min(nums[l], nums[r]);
	}
}
