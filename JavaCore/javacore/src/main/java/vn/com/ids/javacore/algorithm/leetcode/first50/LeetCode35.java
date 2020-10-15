package vn.com.ids.javacore.algorithm.leetcode.first50;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LeetCode35 {
	private static Logger logger = LoggerFactory.getLogger(LeetCode35.class);
	
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
