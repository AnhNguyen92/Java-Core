package javacore.algorithm.leetcode.under0200;

import java.util.Arrays;

/*
 * LeetCode 164. Maximum Gap
 */
public class MaximumGap {
    public int maximumGap(int[] nums) {
        Arrays.sort(nums);
        int gap = 0;
        for (int i = 1; i < nums.length; i++) {
            gap = Math.max(nums[i] - nums[i-1], gap);
        }
        return gap;
    }
}
