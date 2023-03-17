package javacore.algorithm.leetcode.under0500;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

/*
 * LeetCode 451. Sort Characters By Frequency
 */
public class SortCharactersByFrequency {
    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        Map<Character, Integer> sortedMap = map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Character, Integer> mapEntry : sortedMap.entrySet()) {
            for (int i = 1; i <= mapEntry.getValue(); i++) {
                sb.append(mapEntry.getKey());
            }
        }
        return sb.toString();
    }
}
