package javacore.algorithm.leetcode.under2600;

/*
 * LeetCode 2575. Find the Divisibility Array of a String
 */
public class FindTheDivisibilityArrayOfAString {
	public int[] divisibilityArray(String word, int m) {
		int[] div = new int[word.length()];
		long r = 0;
		for (int i = 0; i < word.length(); i++) {
			r = (r * 10 + word.charAt(i) - '0') % m;
			if (r == 0) {
				div[i] = 1;
			}
		}
		return div;
	}
}
