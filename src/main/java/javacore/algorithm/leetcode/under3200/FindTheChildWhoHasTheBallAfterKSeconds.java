package javacore.algorithm.leetcode.under3200;

/**
 * 3178. Find the Child Who Has the Ball After K Seconds
 */
public class FindTheChildWhoHasTheBallAfterKSeconds {
    public int numberOfChild(int n, int k) {
        int q = k / (n - 1);
        int r = k % (n - 1);
        if (q % 2 == 0)
            return r;
        return n - r - 1;
    }
}
