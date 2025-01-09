package javacore.algorithm.leetcode.under3500;

/**
 * 3411. Maximum Subarray With Equal Products
 */
public class MaximumSubarrayWithEqualProducts {
    public int maxLength(int[] nums) {
        int prod = 1;
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            prod = 1;
            int gcd = nums[i];
            int lcm = nums[i];
            for (int j = i; j < nums.length; j++) {
                prod *= nums[j];
                gcd = gcd(gcd, nums[j]);
                lcm = lcm(lcm, nums[j]);
                if (prod == lcm * gcd) {
                    ans = Math.max(ans, j - i + 1);
                }
            }
        }
        return ans;
    }

    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public int lcm(int a, int b) {
        return Math.abs(a * b) / gcd(a, b);
    }
}
