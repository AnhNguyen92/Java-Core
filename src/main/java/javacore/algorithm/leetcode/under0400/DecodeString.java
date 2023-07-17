package javacore.algorithm.leetcode.under0400;

/*
 * LeetCode 394. Decode String
 */
public class DecodeString {
	public String decodeString(String s) {
		int x = s.lastIndexOf("[");
		while (x != -1) {
			int y = s.indexOf("]", x + 1);
			int n = 0;
			int i = x - 1;
			while (i >= 0 && Character.isDigit(s.charAt(i))) {
				i--;
			}
			n = Integer.parseInt(s.substring(i + 1, x));
			s = s.replace(s.substring(i + 1, y + 1), s.substring(x + 1, y).repeat(n));
			x = s.lastIndexOf("[");
		}
		return s;
	}
}
