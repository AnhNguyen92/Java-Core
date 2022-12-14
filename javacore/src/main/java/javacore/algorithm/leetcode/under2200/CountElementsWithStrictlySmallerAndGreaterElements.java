package javacore.algorithm.leetcode.under2200;

import java.util.Arrays;

/*
 * LeetCode 2148. Count Elements With Strictly Smaller and Greater Elements
 */
public class CountElementsWithStrictlySmallerAndGreaterElements {
	public int countElements(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[0] && nums[i] < nums[nums.length - 1]) {
                count++;
            }
        }
        return count;
    }
}
