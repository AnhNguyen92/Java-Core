package javacore.algorithm.leetcode.under0800;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
 * LeetCode 748. Shortest Completing Word
 */
public class ShortestCompletingWord {
	public String shortestCompletingWord(String licensePlate, String[] words) {
		Arrays.sort(words, (a, b) -> a.length() - b.length());
		Map<Character, Integer> map = countApperance(licensePlate);
		for (String word : words) {
			if (isCompleteStr(map, word)) {
				return word;
			}
		}
		return "";
	}

	private Map<Character, Integer> countApperance(String licensePlate) {
		Map<Character, Integer> map = new HashMap<>();
		for (char c : licensePlate.toLowerCase().toCharArray()) {
			if (c >= 'a' && c <= 'z') {
				map.put(c, map.getOrDefault(c, 0) + 1);
			}
		}
		return map;
	}

	private boolean isCompleteStr(Map<Character, Integer> map, String s) {
		Map<Character, Integer> sMap = countApperance(s);
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			Character key = entry.getKey();
			Integer val = entry.getValue();
			if (sMap.get(key) == null || sMap.get(key) < val)
				return false;
		}
		return true;
	}
	
	
}
