package javacore.algorithm.leetcode.under0400;

/**
 * 396. Rotate Function
 */
public class RotateFunction {
    public int maxRotateFunction(int[] nums) {
        int sum  = 0;
        int f0 = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            f0 += i * nums[i];
            sum += nums[i];
        }
        int max = f0;
        for (int i = 1; i < n; i++) {
            int f = f0 + sum - n * nums[n - i];
            max = Math.max(max, f);
            f0 =  f;
        }
        return max;
    }
}
