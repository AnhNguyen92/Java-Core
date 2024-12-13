package javacore.algorithm.leetcode.under0200;

import java.util.Arrays;

/**
 * 154. Find Minimum in Rotated Sorted Array II
 */
public class FindMinimumInRotatedSortedArrayII {
    public int findMin(int[] nums) {
        Arrays.sort(nums);
        return nums[0];
    }
}
