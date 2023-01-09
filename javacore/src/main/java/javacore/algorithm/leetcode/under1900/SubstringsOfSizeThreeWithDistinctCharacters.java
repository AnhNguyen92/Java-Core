package javacore.algorithm.leetcode.under1900;

/*
 * LeetCode 1876. Substrings of Size Three with Distinct Characters
 */
public class SubstringsOfSizeThreeWithDistinctCharacters {
	public int countGoodSubstrings(String s) {
		int count = 0;
		for (int i = 0; i <= s.length() - 3; i++) {
			if (s.charAt(i) != s.charAt(i + 1) && s.charAt(i) != s.charAt(i + 2)
					&& s.charAt(i + 1) != s.charAt(i + 2)) {
				count++;
			}
		}

		return count;
	}
}
