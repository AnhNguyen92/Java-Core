package javacore.algorithm.leetcode.under2900;

/**
 * 2894. Divisible and Non-divisible Sums Difference
 */
public class DivisibleAndNonDivisibleSumsDifference {
    public int differenceOfSums(int n, int m) {
        int sum = (n + 1) * n / 2;
        for (int i = m; i <= n; i += m) {
            sum -= i * 2;
        }
        return sum;
    }
}
