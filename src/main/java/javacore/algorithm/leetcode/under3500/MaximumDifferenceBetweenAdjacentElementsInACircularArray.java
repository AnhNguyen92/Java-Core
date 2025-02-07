package javacore.algorithm.leetcode.under3500;

/**
 * 3423. Maximum Difference Between Adjacent Elements in a Circular Array
 */
public class MaximumDifferenceBetweenAdjacentElementsInACircularArray {
    public int maxAdjacentDistance(int[] nums) {
        int n = nums.length;
        int min = Math.abs(nums[0] - nums[n-1]);
        for (int i = 0; i < n - 1; i++) {
            min = Math.max(min, Math.abs(nums[i] - nums[i+1]));
        }
        return min;
    }
}
