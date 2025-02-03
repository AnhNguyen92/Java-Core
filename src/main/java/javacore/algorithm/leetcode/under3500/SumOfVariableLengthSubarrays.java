package javacore.algorithm.leetcode.under3500;

/**
 * 3427. Sum of Variable Length Subarrays
 */
public class SumOfVariableLengthSubarrays {
    public int subarraySum(int[] nums) {
        int ans = 0;
        int sum = 0;
        int[] prefix = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            prefix[i] += nums[i];
            if (i > 0)
                prefix[i] += prefix[i-1];
            int start = Math.max(0, i - nums[i]);
            ans += prefix[i];
            if (start > 0)
                ans -= prefix[start-1];
        }
        return ans;
    }
}
