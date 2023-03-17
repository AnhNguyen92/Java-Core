package javacore.algorithm.leetcode.under0900;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * LeetCode 890. Find and Replace Pattern
 */
public class FindAndReplacePattern {
	public List<String> findAndReplacePattern(String[] words, String pattern) {
        int n = pattern.length();
        Map<Character, Character> map;
        Map<Character, Character> reversemap;
        List<String> lst = new ArrayList<>();
        boolean found;
        char p;
        char w;
        for (String word : words) {
            map = new HashMap<>();
            reversemap = new HashMap<>();
            found = true;
            for (int i  = 0; i < n; i++) {
                p = pattern.charAt(i);
                w = word.charAt(i);
                if (map.get(p) == null && reversemap.get(w) == null) {
                    map.put(p, w);
                    reversemap.put(w, p);
                } else if (map.getOrDefault(p, '1') != w 
                       || reversemap.getOrDefault(w, '1') != p) {
                    found = false;
                    break;
                }
            }
            if (found) {
                lst.add(word);
            }
        }
        return lst;
    }
}
