package javacore.algorithm.leetcode.under3400;

/**
 * 3381. Maximum Subarray Sum With Length Divisible by K
 */
public class MaximumSubarraySumWithLengthDivisibleByK {
    public long maxSubarraySum(int[] nums, int k) {
        long[] preSum = new long[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            preSum[i + 1] = nums[i] + preSum[i];
        }

        long[] min = new long[k];
        System.arraycopy(preSum, 0, min, 0, k);
        long ans = Long.MIN_VALUE;
        for (int i = k; i < preSum.length; i++) {
            ans = Math.max(ans, preSum[i] - min[i % k]);
            min[i % k] = Math.min(min[i % k], preSum[i]);
        }
        return ans;
    }
}
