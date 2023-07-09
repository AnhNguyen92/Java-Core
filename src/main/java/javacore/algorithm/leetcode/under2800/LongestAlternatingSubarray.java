package javacore.algorithm.leetcode.under2800;

/*
 * LeetCode 2765. Longest Alternating Subarray
 */
public class LongestAlternatingSubarray {
	public int alternatingSubarray(int[] nums) {
        int diff = 1;
        int count = 0;
        int max = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] - nums[i-1] == diff) {
                if (count == 0) {
                    count = 2;
                } else {
                    count++;
                }
                diff *= -1;
            } else {
                max = Math.max(max, count);
                count = 0;
                diff = 1;
                if (nums[i] - nums[i-1] == 1) {
                    count = 2;
                    diff = -1;
                }
            }
        }
        max = Math.max(max, count);
        return (max == 0) ? -1 : max;
    }
}
