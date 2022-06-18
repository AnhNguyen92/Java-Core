package javacore.algorithm.leetcode.under0051;

/*
 * LeetCode 5
 */
public class LongestPalindromicSubstring {

	public String longestPalindrome(String s) {
		int len = s.length();
		for (int i = len; i >= 2; i--) {
			for (int j = 0; j <= len - i; j++) {
				if (isPalindrome(s, j, i + j - 1)) {
					return s.substring(j, i + j);
				}
			}
		}
		return s.substring(0, 1);
	}

	private boolean isPalindrome(String str, int i, int j) {
		while (i < j) {
			if (str.charAt(i) != str.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}

}
