package javacore.algorithm.leetcode.under0100;

/*
 * LeetCode 81. Search in Rotated Sorted Array II
 */
public class SearchInRotatedSortedArrayII {
	public boolean search(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++)
			if (nums[i] == target)
				return true;
		return false;
	}
}
