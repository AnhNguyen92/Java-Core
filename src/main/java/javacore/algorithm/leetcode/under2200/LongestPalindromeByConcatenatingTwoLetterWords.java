package javacore.algorithm.leetcode.under2200;

import java.util.HashMap;
import java.util.Map;

/**
 * 2131. Longest Palindrome by Concatenating Two Letter Words
 */
public class LongestPalindromeByConcatenatingTwoLetterWords {
    public int longestPalindrome(String[] words) {
        int[] repeated = new int[26];
        boolean firstime = true;
        Map<String, Integer> map = new HashMap<>();
        for (String w : words) {
            if (w.charAt(0) == w.charAt(1)) {
                repeated[w.charAt(0) - 'a'] += 2;
            } else {
                map.merge(w, 2, Integer::sum);
            }
        }
        int ans = 0;

        for (int i = 0; i < 26; i++) {
            if (repeated[i] > 2) {
                ans += repeated[i];
                if (repeated[i] % 4 == 2) {
                    if (firstime)
                        firstime = false;
                    else
                        ans -= 2;
                }
            }
            else if (firstime && repeated[i] > 0) {
                ans += 2;
                firstime = false;
            }
        }
        Map<String, Boolean> counted = new HashMap<>();
        for (String s : map.keySet()) {
            if (counted.get(s) == null) {
                String reversed = new StringBuilder(s).reverse().toString();
                if (map.get(reversed) != null) {
                    ans += 2 * Math.min(map.get(s), map.get(reversed));
                    counted.put(reversed, true);
                }
            }
        }
        return ans;
    }
}
