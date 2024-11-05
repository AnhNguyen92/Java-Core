package javacore.algorithm.leetcode.under2800;

/**
 * 2760. Longest Even Odd Subarray With Threshold
 */
public class LongestEvenOddSubarrayWithThreshold {
    public int longestAlternatingSubarray(int[] nums, int threshold) {
        int ans = 0;
        int count = 0;
        int r = nums[0] % 2;
        int r1;
        for (int num : nums) {
            r1 = r;
            r = num % 2;
            if (count > 0 && num <= threshold && r != r1) {
                count++;
            } else {
                ans = Math.max(count, ans);
                count = 0;
                if (num <= threshold && r == 0) {
                    count = 1;
                }
            }
        }
        return Math.max(count, ans);
    }
}
