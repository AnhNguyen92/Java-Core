package javacore.algorithm.leetcode.under51;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * LeetCode #27
 */

public class RemoveElement {
    
    private static final Logger logger = LoggerFactory.getLogger(RemoveElement.class);
    
	public static void main(String[] args) {
		int[] nums = new int[] { 0, 1, 2, 2, 3, 0, 4, 2 };
		int val = 2;
		int counter = 0;
		int i = 0;
		int j = nums.length - 1;
		while (i <= j) {
			if (nums[i] == val) {
				nums[i] = nums[j];
				nums[j] = val;
				j--;
				counter++;
			} else {
				i++;
			}
		}
		for (int j2 = 0; j2 < nums.length; j2++) {
			logger.info("{}", nums[j2]);
		}
		logger.info("{}", nums.length - counter);
	}
}
