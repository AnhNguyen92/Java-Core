package javacore.algorithm.leetcode.under2500;

/*
 * LeetCode 2427
 */
public class NumberOfCommonFactors {
    public int commonFactors(int a, int b) {
        int count = 1;
        for (int i = 2; i <= Math.min(a, b); i++) {
            if (a % i == 0 && b % i == 0) {
                count++;
            }
        }
        return count;
    }
}
