package javacore.algorithm.leetcode.under1900;

/*
 * Leetcode 1844
 */
public class ReplaceAllDigitsWithCharacters {
	private char[] alphabet = new char[] { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o',
			'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };

	public String replaceDigits(String s) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			if (Character.isDigit(s.charAt(i))) {
				sb.append(shift(s.charAt(i - 1), s.charAt(i) - '0'));
			} else {
				sb.append(s.charAt(i));
			}
		}
		return sb.toString();
	}

	private char shift(char c, int i) {
		return alphabet[(c - 'a') + i];
	}
}
