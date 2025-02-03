package javacore.algorithm.leetcode.under3100;

import java.util.ArrayList;
import java.util.List;

/**
 * 3039. Apply Operations to Make String Empty
 */
public class ApplyOperationsToMakeStringEmpty {
    public String lastNonEmptyString(String s) {
        int[] arr = new int[26];
        int max = 0;
        for (char c : s.toCharArray()) {
            arr[c - 'a']++;
            max = Math.max(arr[c - 'a'], max);
        }

        List<Character> lst = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            if (max == arr[i]) {
                lst.add((char) ('a' + i));
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (lst.contains(c)) {
                sb.insert(0, c);
                lst.remove(Character.valueOf(c));
            }
        }
        return sb.toString();
    }
}
