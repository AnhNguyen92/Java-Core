package javacore.algorithm.leetcode.under2800;

/*
 * LeetCode 2744. Find Maximum Number of String Pairs
 */
public class FindMaximumNumberOfStringPairs {
	public int maximumNumberOfStringPairs(String[] words) {
		int count = 0;
		int n = words.length;
		String[] reverse = new String[n];
		for (int i = 1; i < n; i++) {
			reverse[i] = new StringBuilder(words[i]).reverse().toString();
		}
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (words[i].equals(reverse[j])) {
					reverse[j] = "";
					count++;
					break;
				}
			}
		}
		return count;
	}
}
