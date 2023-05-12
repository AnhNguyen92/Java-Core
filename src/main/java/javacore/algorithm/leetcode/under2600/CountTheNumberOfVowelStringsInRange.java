package javacore.algorithm.leetcode.under2600;

/*
 * LeetCode 2586. Count the Number of Vowel Strings in Range
 */
public class CountTheNumberOfVowelStringsInRange {
	public int vowelStrings(String[] words, int left, int right) {
		int count = 0;
		for (int i = left; i <= right; i++) {
			if (vowelStrings(words[i])) {
				count++;
			}
		}
		return count;
	}

	private boolean vowelStrings(String s) {
		char c = s.charAt(0);
		if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
			c = s.charAt(s.length() - 1);
			return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
		}
		return false;
	}
}
