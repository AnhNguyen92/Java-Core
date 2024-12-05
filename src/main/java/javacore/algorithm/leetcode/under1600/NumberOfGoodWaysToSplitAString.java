package javacore.algorithm.leetcode.under1600;

import java.util.HashMap;
import java.util.Map;

/**
 * 1525. Number of Good Ways to Split a String
 */
public class NumberOfGoodWaysToSplitAString {
    public int numSplits(String s) {
        Map<Character, Integer> left = new HashMap<>();
        Map<Character, Integer> right = new HashMap<>();
        char[] arr = s.toCharArray();
        for (char c : arr) {
            right.merge(c, 1, Integer::sum);
        }
        int count = 0;
        for (char c : arr) {
            left.merge(c, 1, Integer::sum);
            right.merge(c, -1, Integer::sum);
            if (right.get(c) == 0) {
                right.remove(c);
            }
            count += left.size() == right.size() ? 1 : 0;
        }
        return count;
    }
}
