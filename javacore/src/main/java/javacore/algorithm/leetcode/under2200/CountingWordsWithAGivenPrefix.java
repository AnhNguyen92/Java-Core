package javacore.algorithm.leetcode.under2200;

/*
 * LeetCode 49
 */
public class CountingWordsWithAGivenPrefix {
	public int prefixCount(String[] words, String pref) {
		int count = 0;
		for (String s : words) {
			if (s.startsWith(pref, 0))
				count++;
		}
		return count;
	}
}
