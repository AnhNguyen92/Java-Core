package javacore.algorithm.leetcode.under0500;

/*
 * Leetcode 461. Hamming Distance
 */
public class HammingDistance {
	public int hammingDistance(int x, int y) {
		String xstr = Integer.toBinaryString(x);
		String ystr = Integer.toBinaryString(y);
		int count = 0;
		int i = xstr.length() - 1;
		int j = ystr.length() - 1;
		char c1;
		char c2;
		while (i >= 0 || j >= 0) {
			c1 = (i >= 0) ? xstr.charAt(i) : '0';
			c2 = (j >= 0) ? ystr.charAt(j) : '0';
			if (c1 != c2)
				count++;
			j--;
			i--;
		}
		return count;
	}
}
