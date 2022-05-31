package javacore.algorithm.leetcode.under0300;

import java.util.Arrays;

/*
 * LeetCode 215
 */
public class KthLargestElementInAnArray {
	public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }
}
