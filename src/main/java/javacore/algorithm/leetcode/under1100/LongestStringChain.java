package javacore.algorithm.leetcode.under1100;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
 * LeetCode 1048. Longest String Chain
 */
public class LongestStringChain {

	public int longestStrChain(String[] words) {
		Arrays.sort(words, (a, b) -> a.length() - b.length());
		Map<String, Integer> map = new HashMap<>();
		int ans = 0;
		for (String word : words) {
			int maxLen = 0;
			for (int i = 0; i < word.length(); i++) {
				String str = new StringBuilder(word).deleteCharAt(i).toString();
				maxLen = Math.max(maxLen, map.getOrDefault(str, 0) + 1);
			}
			map.put(word, maxLen);
			if (maxLen > ans) {
				ans = maxLen;
			}
		}

		return ans;
	}
}
