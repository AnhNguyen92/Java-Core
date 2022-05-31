package javacore.algorithm.leetcode.under0700;

/*
 * LeetCode 680
 */
public class ValidPalindromeII {
	public boolean validPalindrome(String s) {
		int idx = possiblePalinByRemovingOneChar(s);
		return idx != -1;
	}

	private boolean isPalindrome(String str, int low, int high) {
		while (low < high) {
			if (str.charAt(low) != str.charAt(high))
				return false;
			low++;
			high--;
		}
		return true;
	}

	private int possiblePalinByRemovingOneChar(String str) {
		int low = 0;
		int high = str.length() - 1;
		while (low < high) {
			if (str.charAt(low) == str.charAt(high)) {
				low++;
				high--;
			} else {
				if (isPalindrome(str, low + 1, high))
					return low;
				if (isPalindrome(str, low, high - 1))
					return high;
				return -1;
			}
		}

		return -2;
	}

	public boolean validPalindrome1(String s) {
		int i = 0;
		int j = s.length() - 1;
		while (i < j) {
			if (s.charAt(i) != s.charAt(j)) {
				String s1 = removeChar(s, i);
				String s2 = removeChar(s, j);
				return isPalindrome(s1) || isPalindrome(s2);
			}
			i++;
			j--;
		}
		return true;
	}

	private String removeChar(String str, int i) {
		StringBuilder sb = new StringBuilder(str);
		sb.deleteCharAt(i);
		return sb.toString();
	}

	private boolean isPalindrome(String str) {
		int i = 0;
		int j = str.length() - 1;
		while (i < j) {
			if (str.charAt(i) != str.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}
}
