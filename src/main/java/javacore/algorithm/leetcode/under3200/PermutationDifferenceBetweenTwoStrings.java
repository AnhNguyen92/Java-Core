package javacore.algorithm.leetcode.under3200;

import java.util.HashMap;
import java.util.Map;

/**
 * 3146. Permutation Difference between Two Strings
 */
public class PermutationDifferenceBetweenTwoStrings {
    public int findPermutationDifference(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        int diff = 0;
        Integer x;
        char c, d;
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            d = t.charAt(i);
            x = map.get(c);
            if (x != null) {
                diff += i + x;
            } else {
                map.put(c, i);
            }
            if (map.get(d) != null) {
                diff += i - map.get(d);
            } else {
                map.put(d, -i);
            }
        }
        return diff;
    }
}
