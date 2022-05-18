package javacore.algorithm.leetcode.under2100;

/*
 * LeetCode 2016
 */
public class MaximumDifferenceBetweenIncreasingElements {
	public int maximumDifference(int[] nums) {
        int min  = nums[0];
        int max = -1;
        for (int i = 0; i < nums.length; i++) {
            if (min > nums[i]) {
                min = nums[i];
            } else if (nums[i] > min && nums[i] - min > max) {
                max = nums[i] - min;
            }
        }
        return max;
    }
}
