package javacore.algorithm.leetcode.under0200;

/*
 * LeetCode 191. Number of 1 Bits
 */
public class NumberOf1Bits {
	public int hammingWeight(int n) {
        int bits = 0;
        int mask = 1;
        for (int i = 0; i < 32; i++) {
            if ((n & mask) != 0) {
                bits++;
            }
            mask <<= 1;
        }
        return bits;
    }
}
