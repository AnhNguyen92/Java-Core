package javacore.algorithm.leetcode.under1700;

import java.util.Arrays;

/*
 * Leetcode 1685. Sum of Absolute Differences in a Sorted Array
 */
public class SumOfAbsoluteDifferencesInASortedArray {
	public int[] getSumAbsoluteDifferences(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int sumBelow = 0;
        int sumTotal = Arrays.stream(nums).sum();

        for (int i = 0; i < n; i++) {
            sumTotal -= nums[i];
            res[i] = sumTotal - (n - i - i - 1) * nums[i] - sumBelow;
            sumBelow += nums[i];
        }
        return res;
    }
}
