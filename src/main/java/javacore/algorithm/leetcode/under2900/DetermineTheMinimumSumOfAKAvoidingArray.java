package javacore.algorithm.leetcode.under2900;

/** 2829. Determine the Minimum Sum of a k-avoiding Array
 *
 */
public class DetermineTheMinimumSumOfAKAvoidingArray {
    public int minimumSum(int n, int k) {
        if (k/2 >= n) {
            return (n + 1) * n / 2;
        }
        int sum = k/2 * (k/2 + 1) / 2;
        for (int i = k; i < n + k - k/2; i++) {
            sum += i;
        }
        return sum;
    }
}
