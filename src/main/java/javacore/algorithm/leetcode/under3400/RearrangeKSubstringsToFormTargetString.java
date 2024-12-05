package javacore.algorithm.leetcode.under3400;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * 3365. Rearrange K Substrings to Form Target String
 */
public class RearrangeKSubstringsToFormTargetString {
    public boolean isPossibleToRearrange(String s, String t, int k) {
        Map<String, Integer> map = new HashMap<>();
        int n = s.length() / k;
        for (int i = 0; i < s.length(); i += n) {
            String str = s.substring(i, i + n);
            map.put(str, map.getOrDefault(str, 0) + 1);
            str = t.substring(i, i + n);
            map.put(str, map.getOrDefault(str, 0) - 1);
        }

        return new HashSet<>(map.values()).size() == 1;
    }
}
