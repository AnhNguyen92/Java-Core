package javacore.algorithm.leetcode.under3400;

/**
 * 3355. Zero Array Transformation I
 */
public class ZeroArrayTransformationI {
    public boolean isZeroArray(int[] nums, int[][] queries) {
        int n = nums.length;
        int[] dp = new int[n+1];
        for (int[] arr : queries) {
            dp[arr[0]] -= 1;
            dp[arr[1] + 1] += 1;
        }
        for (int i = 1; i <= n; i++) {
            dp[i] += dp[i-1];
            if (dp[i-1] + nums[i-1] > 0)
                return false;
        }
        return true;
    }
}
