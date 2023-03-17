package javacore.algorithm.leetcode.under2100;

import java.util.HashMap;
import java.util.Map;

/*
 * LeetCode 2085. Count Common Words With One Occurrence
*/
public class CountCommonWordsWithOneOccurrence {
	public int countWords(String[] words1, String[] words2) {
		Map<String, Integer> map = new HashMap<>();
		for (int i = 0; i < words1.length; i++) {
			String s = words1[i];
			map.put(s, map.getOrDefault(s, 0) + 1);
		}
		map.entrySet().removeIf(e -> e.getValue() != 1);
		for (int i = 0; i < words2.length; i++) {
			String s = words2[i];
			map.put(s, map.getOrDefault(s, 0) + 1);
		}
		return (int) map.values().stream().filter(v -> v == 2).count();
	}
}
