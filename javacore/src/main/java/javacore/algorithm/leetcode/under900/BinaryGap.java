package javacore.algorithm.leetcode.under900;

/*
 * LeetCode 868
 */
public class BinaryGap {
	public int binaryGap(int n) {
		int max = 0;
		String s = Integer.toBinaryString(n);
		int i = 0;
		while (i < s.length()) {
			if (s.charAt(i) == '0')
				i++;
			else {
				int j = i + 1;
				while (j < s.length() && s.charAt(j) == '0') {
					j++;
				}
				if (j < s.length() && max < j - i)
					max = j - i;
				i = j;
			}
		}
		return max;
	}
}
