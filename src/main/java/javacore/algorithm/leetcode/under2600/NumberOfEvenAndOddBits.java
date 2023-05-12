package javacore.algorithm.leetcode.under2600;

/*
 * LeetCode 2595. Number of Even and Odd Bits
 */
public class NumberOfEvenAndOddBits {
	public int[] evenOddBit(int n) {
		int[] ans = new int[2];
		String s = Integer.toBinaryString(n);
		for (int i = s.length() - 1; i >= 0; i--) {
			if (s.charAt(i) == '1') {
				if ((s.length() - 1 - i) % 2 == 0) {
					ans[0]++;
				} else {
					ans[1]++;
				}
			}
		}
		return ans;
	}
}
