package javacore.algorithm.leetcode.under0051;

/*
 * LeetCode 35
 */

public class SearchInsertPosition {
	public int searchInsert(int[] nums, int target) {
		int position = 0;
		
		while (position < nums.length && target > nums[position]) {
			position++;
		}
		return position;
	}

}
