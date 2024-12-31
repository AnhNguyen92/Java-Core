package javacore.algorithm.leetcode.under3400;

/**
 * 3392. Count Subarrays of Length Three With a Condition
 */
public class CountSubarraysOfLengthThreeWithACondition {
    public int countSubarrays(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            if ( (nums[i] + nums[i+2]) * 2 == nums[i+1]) {
                count++;
            }
        }
        return count;
    }
}
