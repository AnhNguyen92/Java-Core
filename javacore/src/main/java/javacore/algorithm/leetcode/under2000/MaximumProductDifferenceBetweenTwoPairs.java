package javacore.algorithm.leetcode.under2000;

import java.util.Arrays;

/*
 * LeetCode 1913
 */
public class MaximumProductDifferenceBetweenTwoPairs {
	public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length - 1] * nums[nums.length - 2] - nums[0] * nums[1];
    }
}
