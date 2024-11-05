package javacore.algorithm.leetcode.under3000;

/**
 * 2932. Maximum Strong Pair XOR I
 */
public class MaximumStrongPairXORI {
    public int maximumStrongPairXor(int[] nums) {
        int ans = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (Math.abs(nums[i] - nums[j]) <= Math.min(nums[i], nums[j]))
                    ans = Math.max(ans, nums[i] ^ nums[j]);
            }
        }
        return ans;
    }
}
