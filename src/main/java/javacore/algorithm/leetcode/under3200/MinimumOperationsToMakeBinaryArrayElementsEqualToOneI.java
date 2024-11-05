package javacore.algorithm.leetcode.under3200;

/**
 * 3191. Minimum Operations to Make Binary Array Elements Equal to One I
 */
public class MinimumOperationsToMakeBinaryArrayElementsEqualToOneI {
    public int minOperations(int[] nums) {
        int ans = 0;
        int n = nums.length;
        for (int i = 0; i < n - 2; i++) {
            if (nums[i] == 0) {
                nums[i] ^= 1;
                nums[i + 1] ^= 1;
                nums[i + 2] ^= 1;
                ans++;
            }
        }
        if (nums[n - 3] == 0 || nums[n - 2] == 0 || nums[n - 1] == 0)
            return -1;
        return ans;
    }
}
