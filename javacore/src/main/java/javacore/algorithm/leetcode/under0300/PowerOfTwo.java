package javacore.algorithm.leetcode.under0300;

/*
 *LeetCode 231. Power of Two
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
