package javacore.algorithm.leetcode.under0100;

/*
 * LeetCode 81. Search in Rotated Sorted Array II
 */
public class SearchInRotatedSortedArrayII {
	public boolean search(int[] nums, int target) {
        for (int num : nums)
            if (num == target)
                return true;
		return false;
	}
}
