package javacore.algorithm.leetcode.under0700;

/*
 * LeetCode 693. Binary Number with Alternating Bits
 */
public class BinaryNumberWithAlternatingBits {
	public boolean hasAlternatingBits(int n) {
		int cur = n % 2;
		n /= 2;
		while (n > 0) {
			if (cur == n % 2)
				return false;
			cur = n % 2;
			n /= 2;
		}
		return true;
	}

	public boolean hasAlternatingBits1(int n) {
		String bits = Integer.toBinaryString(n);
		return !bits.contains("11") && !bits.contains("00");
	}
}
