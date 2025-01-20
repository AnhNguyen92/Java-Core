package javacore.algorithm.leetcode.under3500;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * 3412. Find Mirror Score of a String
 */
public class FindMirrorScoreOfAString {
    public long calculateScore(String s) {
        Map<Character, Stack<Integer>> map = new HashMap<>();
        long ans = 0L;
        for (char c = 'a'; c <= 'z'; c++)
            map.put(c,  new Stack<>());
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            char mirror = (char) ('a' + ('z' - c));
            Stack<Integer> pos = map.get(mirror);
            if (pos.isEmpty()) {
                map.get(c).push(i);
            } else {
                ans += i - pos.pop();
            }
        }
        return ans;
    }
}
