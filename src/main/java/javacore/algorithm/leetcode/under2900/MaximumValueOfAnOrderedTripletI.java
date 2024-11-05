package javacore.algorithm.leetcode.under2900;

/**
 * 2873. Maximum Value of an Ordered Triplet I
 */
public class MaximumValueOfAnOrderedTripletI {
    public long maximumTripletValue(int[] nums) {
        long x = 0;
        int n = nums.length;
        for (int i = 0; i < n-2; i++) {
            for (int j = i+1; j < n-1; j++) {
                for (int k = j+1; k < n; k++) {
                    x = Math.max(x, (long) (nums[i] - nums[j]) * nums[k]);
                }
            }
        }
        return x < 0 ? 0 : x;
    }
}
