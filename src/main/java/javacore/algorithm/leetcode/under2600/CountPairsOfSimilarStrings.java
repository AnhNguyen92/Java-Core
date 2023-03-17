package javacore.algorithm.leetcode.under2600;

/*
 * LeetCode 2506. Count Pairs Of Similar Strings
 */
public class CountPairsOfSimilarStrings {
	public int similarPairs(String[] words) {
		int n = words.length;
		String[] srr = new String[n];
		for (int i = 0; i < n; i++) {
			String word = words[i];
			int[] arr = new int[26];
			for (char c : word.toCharArray()) {
				arr[c - 'a'] = 1;
			}
			StringBuilder sb = new StringBuilder();
			for (int j = 0; j < 26; j++) {
				sb.append(arr[j]);
			}
			srr[i] = sb.toString();
		}
		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (srr[i].equals(srr[j])) {
					count++;
				}
			}
		}
		return count;
	}
}
