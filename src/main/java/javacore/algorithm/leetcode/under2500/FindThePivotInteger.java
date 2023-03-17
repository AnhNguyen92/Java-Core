package javacore.algorithm.leetcode.under2500;

/*
 * LeetCode 2485. Find the Pivot Integer
 */
public class FindThePivotInteger {
    public int pivotInteger(int n) {
        int c = (n * n + n);
        int x = (int) Math.sqrt(c/2);
        if (2 * x * x == c)
            return x;
        return -1;
    }
}
