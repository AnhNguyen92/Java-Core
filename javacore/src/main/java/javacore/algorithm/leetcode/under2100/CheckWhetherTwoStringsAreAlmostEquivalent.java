package javacore.algorithm.leetcode.under2100;

/*
 * LeetCode 2068. Check Whether Two Strings are Almost Equivalent
 */
public class CheckWhetherTwoStringsAreAlmostEquivalent {
	public boolean checkAlmostEquivalent(String word1, String word2) {
		int[] arr = new int[26];
		for (char c : word1.toCharArray()) {
			arr[c - 'a']++;
		}
		for (char c : word2.toCharArray()) {
			arr[c - 'a']--;
		}
		int sum = 0;
		for (int i = 0; i < 26; i++) {
			if (arr[i] > 3 || arr[i] < -3) {
				return false;
			}
			sum += arr[i];
		}

		return sum == 0;
	}
}
