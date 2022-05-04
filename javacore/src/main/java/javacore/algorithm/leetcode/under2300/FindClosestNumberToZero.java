package javacore.algorithm.leetcode.under2300;

/*
 * LeetCode 2239
 */
public class FindClosestNumberToZero {
    public int findClosestNumber(int[] nums) {
        int val = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if ( (Math.abs(nums[i]) < max) || (Math.abs(nums[i]) == max && nums[i] > 0) ) {
                val = nums[i];
                max = Math.abs(nums[i]);
            }
        }
        return val;
    }
}
