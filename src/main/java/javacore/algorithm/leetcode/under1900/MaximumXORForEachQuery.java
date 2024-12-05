package javacore.algorithm.leetcode.under1900;

/**
 * 1829. Maximum XOR for Each Query
 */
public class MaximumXORForEachQuery {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        int max = (int) Math.pow(2, maximumBit) - 1;
        int n = nums.length;
        int[] arr = new int[n];
        int prev = 0;
        for (int i = 0; i < n; i++) {
            prev ^= nums[i];
            arr[n-1-i] = prev ^ max;
        }
        return arr;
    }
}
