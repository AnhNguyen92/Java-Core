package javacore.algorithm.leetcode.under2600;

/*
 * LeetCode 2559. Count Vowel Strings in Ranges
 */
public class CountVowelStringsInRanges {
	public int[] vowelStrings(String[] words, int[][] queries) {
		int[] presum = new int[words.length + 1];
		for (int i = 0; i < words.length; i++) {
			String s = words[i];
			presum[i + 1] = presum[i];
			if (isValidStr(s.charAt(0)) && isValidStr(s.charAt(s.length() - 1))) {
				presum[i + 1]++;
			}
		}
		int[] arr = new int[queries.length];
		for (int i = 0; i < queries.length; i++) {
			arr[i] = presum[queries[i][1] + 1] - presum[queries[i][0]];
		}
		return arr;
	}

	private boolean isValidStr(char c) {
		return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
	}
}
