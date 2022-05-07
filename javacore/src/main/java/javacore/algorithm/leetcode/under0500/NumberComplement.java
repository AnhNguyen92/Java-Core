package javacore.algorithm.leetcode.under0500;

/*
 * Leetcode 476
 */
public class NumberComplement {
	public int findComplement(int num) {
		int mask = (Integer.highestOneBit(num) << 1) - 1;
		return num ^ mask;
	}
}
