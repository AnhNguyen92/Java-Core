package javacore.algorithm.leetcode.under3200;

/**
 * 3101. Count Alternating Subarrays
 */
public class CountAlternatingSubarrays {
    public long countAlternatingSubarrays(int[] nums) {
        long ans = 0;
        long count = 1;
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] != nums[i - 1]) {
                count++;
            } else {
                count = 1;
            }
            ans += count;
        }
        return ans;
    }
}
