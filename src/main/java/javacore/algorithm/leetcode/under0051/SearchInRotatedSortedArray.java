package javacore.algorithm.leetcode.under0051;


/*
 * LeetCode 33. Search in Rotated Sorted Array
*/
public class SearchInRotatedSortedArray {
	public int search(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++)
            if (nums[i] == target)
                return i;
        return -1;
    }
}
