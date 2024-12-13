package javacore.algorithm.leetcode.under3400;

/**
 * 3379. Transformed Array
 */
public class TransformedArray {
    public int[] constructTransformedArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0)
                ans[i] = 0;
            else if (nums[i] > 0) {
                ans[i] = nums[(i + nums[i] % n) % n];
            } else {
                ans[i] = nums[(n + i + nums[i] % n) % n];
            }
        }
        return ans;
    }
}
