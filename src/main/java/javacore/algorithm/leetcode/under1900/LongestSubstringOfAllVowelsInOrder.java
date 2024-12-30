package javacore.algorithm.leetcode.under1900;

import java.util.HashMap;
import java.util.Map;

/**
 * 1839. Longest Substring Of All Vowels in Order
 */
public class LongestSubstringOfAllVowelsInOrder {
    public int longestBeautifulSubstring(String word) {
        Map<Integer, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        char prev = '\u0000';
        char c;
        for (int i = 0; i < word.length(); i++) {
            c = word.charAt(i);
            if (c != prev) {
                sb.append(c);
                prev = c;
                if (c == 'a') {
                    map.put(sb.length() - 1, i);
                }
                if (i == word.length() - 1) {
                    map.put(sb.length() - 1, i);
                }
            }
            if (c == 'u') {
                map.put(sb.length() - 1, i);
            }
        }
        int i = 0;
        int ans = 0;
        while ((i = sb.indexOf("aeiou", i)) >= 0) {
            ans = Math.max(ans, map.get(i + 4) - map.get(i) + 1);
            i += 5;
        }
        return ans;
    }
}
