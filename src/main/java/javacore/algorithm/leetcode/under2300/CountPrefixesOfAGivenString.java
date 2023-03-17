package javacore.algorithm.leetcode.under2300;

/*
 * LeetCode 2255. Count Prefixes of a Given String
 */
public class CountPrefixesOfAGivenString {
	public int countPrefixes(String[] words, String s) {
		int count = 0;
		int len = s.length();
		for (String word : words) {
			if (word.length() <= len && s.startsWith(word)) {
				count++;
			}
		}
		return count;
	}
}
