package javacore.algorithm.leetcode.under1400;

/*
 * LeetCode 1318. Minimum Flips to Make a OR b Equal to c
 */
public class MinimumFlipsToMakeAORBEqualToC {
	public int minFlips(int a, int b, int c) {
		String ba = String.format("%32s", Integer.toBinaryString(a)).replace(' ', '0');
		String bb = String.format("%32s", Integer.toBinaryString(b)).replace(' ', '0');
		String bc = String.format("%32s", Integer.toBinaryString(c)).replace(' ', '0');
		int count = 0;
		for (int i = 0; i < 32; i++) {
			if (bc.charAt(i) == '0') {
				if (ba.charAt(i) == '1') {
					count++;
				}
				if (bb.charAt(i) == '1') {
					count++;
				}
			} else if (ba.charAt(i) == '0' && bb.charAt(i) == '0') {
				count++;
			}
		}
		return count;
	}
}
