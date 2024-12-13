package javacore.algorithm.leetcode.under1200;

import java.util.HashMap;
import java.util.Map;

/**
 * 1124. Longest Well-Performing Interval
 */
public class LongestWellPerformingInterval {
    public int longestWPI(int[] hours) {
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0;
        int sum = 0;
        for (int i = 0; i < hours.length; i++) {
            sum += (hours[i] > 8) ? 1 : -1;
            map.putIfAbsent(sum, i);
            if (sum > 0) {
                max = i + 1;
            } else if (map.get(sum-1) != null) {
                max = Math.max(max, i - map.get(sum-1));
            }
        }
        return max;
    }
}
