package javacore.algorithm.leetcode.under3400;

/**
 * 3370. Smallest Number With All Set Bits
 */
public class SmallestNumberWithAllSetBits {
    public int smallestNumber(int n) {
        int i = 1;
        while (i - 1 < n) {
            i = i << 1;
        }
        return i - 1;
    }
}
