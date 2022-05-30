package javacore.algorithm.leetcode.under1400;

/*
 * LeetCode 1332
 */
public class RemovePalindromicSubsequences {
	public int removePalindromeSub(String s) {
		if (s.length() == 0)
			return 0;
		int i = 0;
		int j = s.length() - 1;
		int count = 0;
		do {
			boolean isValid = isPalindromic(s, i, j);
			if (isValid) {
				i = j + 1;
				j = s.length() - 1;
				count++;
			} else {
				j--;
			}
		} while (i <= j);
		return (count > 2 ? 2 : count);
	}

	private boolean isPalindromic(String str, int start, int end) {
		String input = str.substring(start, end + 1);

		StringBuilder sb = new StringBuilder(input);
		sb.reverse();

		return input.equals(sb.toString());
	}
}
