package javacore.algorithm.leetcode.under3300;
/*
 * LeetCode 3300. Minimum Element After Replacement With Digit Sum
 */
public class MinimumElementAfterReplacementWithDigitSum {
    public int minElement(int[] nums) {
        int ans = 36;
        for (int x : nums) {
            ans = Math.min(sum(x), ans);
        }
        return ans;
    }

    private int sum(int x) {
        int sum = 0;
        while (x > 0) {
            sum += x % 10;
            x /= 10;
        }
        return sum;
    }
}
