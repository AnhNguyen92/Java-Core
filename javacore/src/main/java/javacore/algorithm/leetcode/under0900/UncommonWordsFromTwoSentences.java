package javacore.algorithm.leetcode.under0900;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * LeetCode 872. Uncommon Words from Two Sentences
 */
public class UncommonWordsFromTwoSentences {
	public String[] uncommonFromSentences(String a, String b) {
        Map<String, Integer> map = new HashMap<>();
        String[] arrA = a.split(" ");
        String[] arrB = b.split(" ");
        for (String s : arrA)
            map.put(s, map.getOrDefault(s, 0) + 1);
        for (String s : arrB)
            map.put(s, map.getOrDefault(s, 0) + 1);
        List<String> lst = new ArrayList<>();
        for (String key : map.keySet()) {
            if (map.get(key).intValue() == 1) {
                lst.add(key);
            }
        }
        return lst.toArray(new String[0]);
    }
}
