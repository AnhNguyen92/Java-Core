package javacore.algorithm.leetcode.under2000;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
 * LeetCode 1941. Check if All Characters Have Equal Number of Occurrences
 */
public class CheckIfAllCharactersHaveEqualNumberOfOccurrences {
	public boolean areOccurrencesEqual(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        Set<Integer> set = new HashSet<>(map.values());
        return set.size() == 1;
    }
}
