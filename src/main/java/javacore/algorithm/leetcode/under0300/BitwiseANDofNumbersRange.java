package javacore.algorithm.leetcode.under0300;

/*
 * LeetCode 201. Bitwise AND of Numbers Range
 */
public class BitwiseANDofNumbersRange {
	public int rangeBitwiseAnd(int left, int right) {
		int s = 0;
		while (left != right) {
			left = left >> 1;
			right = right >> 1;
			s++;
		}
		return (left << s);
	}
}
