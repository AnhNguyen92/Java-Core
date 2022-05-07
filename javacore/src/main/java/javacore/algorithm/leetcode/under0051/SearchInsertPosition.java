package javacore.algorithm.leetcode.under0051;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * LeetCode 35
 */

public class SearchInsertPosition {
	private static Logger logger = LoggerFactory.getLogger(SearchInsertPosition.class);
	
	public static void main(String[] args) {
		int[] nums = new int[] { 1, 3, 5, 6 };
		int target = 7;
		logger.info("{}", searchInsert(nums, target));
	}

	public static int searchInsert(int[] nums, int target) {
		int position = 0;
		
		while (position < nums.length && target > nums[position]) {
			position++;
		}
		return position;
	}

}
