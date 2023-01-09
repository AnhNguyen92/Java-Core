package javacore.algorithm.leetcode.under1900;

/*
 * Leetcode 1869. Longer Contiguous Segments of Ones than Zeros
 */
public class LongerContiguousSegmentsOfOnesThanZeros {
	public boolean checkZeroOnes(String s) {
		int oneCount = 0;
		int zeroCount = 0;
		int i = 0;
		while (i < s.length()) {
			int j = i;
			char c = s.charAt(i);
			while (j < s.length() && s.charAt(j) == c) {
				j++;
			}
			int k = j - i;
			if (c == '0' && k + 1 > zeroCount) {
				zeroCount = k;
			} else if (c == '1' && k + 1 > oneCount) {
				oneCount = k;
			}
			i = j;
		}

		return oneCount > zeroCount;
	}
}
