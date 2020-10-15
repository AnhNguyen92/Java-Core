package vn.com.ids.javacore.algorithm.leetcode.first50;

import java.util.HashMap;
import java.util.Map;

public class LeetCode1 {
	public static void main(String[] args) {
		int[] nums = new int[] { 2, 7, 11, 15 };
		int target = 9;
		System.out.println(twoSum(nums, target));
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
