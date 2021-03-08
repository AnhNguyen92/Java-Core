package javacore.algorithm.leetcode.under51;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * Leetcode #1
 */
public class TwoSum {
    
    private static final Logger logger = LoggerFactory.getLogger(TwoSum.class);
    
	public static void main(String[] args) {
		int[] nums = new int[] { 2, 7, 11, 15 };
		int target = 22;
		int[] result = twoSum(nums, target);
		for (int i = 0; i < result.length; i++) {
            logger.info("{}", result[i]);
        }
	}

	public static int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> numMap = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];
			if (numMap.containsKey(complement)) {
				return new int[] { numMap.get(complement), i };
			} else {
				numMap.put(nums[i], i);
			}
		}
		return new int[] {};

	}
}
