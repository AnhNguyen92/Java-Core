package javacore.algorithm.leetcode.under1400;

/*
 * LeetCode 1332. Remove Palindromic Subsequences
 */
public class RemovePalindromicSubsequences {
	public int removePalindromeSub(String s) {
		int i = 0;
		int j = s.length() - 1;
		int count = 0;
		while (i <= j) {
			if (isPalindromic(s, i, j)) {
				i = j + 1;
				j = s.length() - 1;
				count++;
			} else {
				j--;
			}
		}
		return (count > 2 ? 2 : count);
	}

	private boolean isPalindromic(String str, int start, int end) {
		while (start < end) {
			if (str.charAt(start++) != str.charAt(end--))
				return false;
		}

		return true;
	}
}
