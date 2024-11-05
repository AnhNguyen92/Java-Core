package javacore.algorithm.leetcode.under2800;

/**
 * 2778. Sum of Squares of Special Elements
 */
public class SumOfSquaresOfSpecialElements {
    public int sumOfSquares(int[] nums) {
        int sum = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (n % (i + 1) == 0) {
                sum += nums[i] * nums[i];
            }
        }
        return sum;
    }
}
