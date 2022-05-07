package javacore.algorithm.leetcode.under0900;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/*
 * LeetCode 819
 */
public class MostCommonWord {
	public String mostCommonWord(String paragraph, String[] banned) {
        Map<String, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        List<String> lst = new ArrayList<>();
        for (char c : paragraph.toCharArray()) {
            if (Character.isLetter(c)) {
                sb.append(c);
            } else {
                String s = sb.toString().toLowerCase();
                if (s.length() > 0)
                    lst.add(s);
                sb = new StringBuilder();
            }
        }
        String s1 = sb.toString().toLowerCase();
                if (s1.length() > 0)
                    lst.add(s1);
        for (String s : lst) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        for (String s : banned) {
            map.remove(s);
        }
        LinkedHashMap<String, Integer> reverseSortedMap = new LinkedHashMap<>();
        map.entrySet()
        .stream()
        .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())) 
        .forEachOrdered(x -> reverseSortedMap.put(x.getKey(), x.getValue())); 
        return reverseSortedMap.entrySet().stream().findFirst().get().getKey();
    }
}
