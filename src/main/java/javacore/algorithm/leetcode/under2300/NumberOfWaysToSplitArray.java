package javacore.algorithm.leetcode.under2300;

/**
 * 2270. Number of Ways to Split Array
 */
public class NumberOfWaysToSplitArray {
    public int waysToSplitArray(int[] nums) {
        int n = nums.length;
        long[] prefix = new long[n + 1];
        for (int i = 0; i < n; i++) {
            prefix[i+1] = prefix[i] + nums[i];
        }
        int count = 0;
        for (int i = 1; i < n; i++) {
            if (prefix[i] >= prefix[n] - prefix[i])
                count++;
        }
        return count;
    }
}
