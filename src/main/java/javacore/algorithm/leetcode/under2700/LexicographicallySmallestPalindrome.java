package javacore.algorithm.leetcode.under2700;

/*
 * LeetCode 2697. Lexicographically Smallest Palindrome
 */
public class LexicographicallySmallestPalindrome {
	public String makeSmallestPalindrome(String s) {
		int len = s.length();
		char[] crr = new char[len];
		char f, l;
		int j = len - 1;
		for (int i = 0; i <= len / 2; i++, j--) {
			f = s.charAt(i);
			l = s.charAt(j);
			if (f - l >= 0) {
				crr[i] = l;
				crr[j] = l;
			} else {
				crr[i] = f;
				crr[j] = f;
			}
		}
		StringBuilder sb = new StringBuilder();
		for (char c : crr) {
			sb.append(c);
		}
		return sb.toString();
	}
}
