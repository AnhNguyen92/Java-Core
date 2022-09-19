package javacore.algorithm.leetcode.under2400;
/*
 * LeetCode 2413
 */
public class SmallestEvenMultiple {
    public int smallestEvenMultiple(int n) {
        if (n % 2 == 0)
            return n;
        return n * 2;
    }

}
