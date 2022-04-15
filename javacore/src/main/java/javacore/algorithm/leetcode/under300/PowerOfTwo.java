package javacore.algorithm.leetcode.under300;

/*
 * Leet code #231
 */
public class PowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        if (n == 0)
            return false;
        while (n % 2 == 0) {
            n /= 2;
        }
        return n == 1;
    }
}
