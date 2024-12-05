package javacore.algorithm.leetcode.under3100;

/**
 * 3065. Minimum Operations to Exceed Threshold Value I
 */
public class MinimumOperationsToExceedThresholdValueI {
    public int minOperations(int[] nums, int k) {
        int count = 0;
        for (int i : nums) {
            if (i < k) {
                count++;
            }
        }
        return count;
    }
}
