package javacore.algorithm.leetcode.under0400;

import java.util.HashMap;
import java.util.Map;

/*
 * LeetCode 383. Ransom Note
*/
public class RansomNote {
	public boolean canConstruct(String ransomNote, String magazine) {
		Map<Character, Integer> mapNote = new HashMap<>();
		Map<Character, Integer> mapMagazine = new HashMap<>();
		for (char c : ransomNote.toCharArray()) {
			mapNote.put(c, mapNote.getOrDefault(c, 0) + 1);
		}
		for (char c : magazine.toCharArray()) {
			mapMagazine.put(c, mapMagazine.getOrDefault(c, 0) + 1);
		}
		for (Character c : mapNote.keySet()) {
			if (mapMagazine.get(c) == null || (mapMagazine.get(c) < mapNote.get(c))) {
				return false;
			}
		}
		return true;
	}
}
