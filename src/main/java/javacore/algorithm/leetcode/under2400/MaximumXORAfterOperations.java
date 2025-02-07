package javacore.algorithm.leetcode.under2400;

/**
 * 2317. Maximum XOR After Operations
 */
public class MaximumXORAfterOperations {
    public int maximumXOR(int[] nums) {
        int ans = nums[0];
        for (int i = 1; i < nums.length; i++) {
            ans |= nums[i];
        }
        return ans;
    }
}
