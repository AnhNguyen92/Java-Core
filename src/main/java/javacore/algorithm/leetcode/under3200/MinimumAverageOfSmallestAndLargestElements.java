package javacore.algorithm.leetcode.under3200;

import java.util.Arrays;

/**
 * 3194. Minimum Average of Smallest and Largest Elements
 */
public class MinimumAverageOfSmallestAndLargestElements {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        int avg = Integer.MAX_VALUE;
        for (int i = 0 ; i < nums.length / 2; i++) {
            avg = Math.min(avg, nums[i] + nums[nums.length - 1 - i]);
        }
        return avg / 2.0;
    }
}
