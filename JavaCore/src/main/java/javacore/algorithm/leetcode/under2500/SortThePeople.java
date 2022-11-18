package javacore.algorithm.leetcode.under2500;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
 * LeetCode 2418. Sort the People
 */
public class SortThePeople {
    public String[] sortPeople(String[] names, int[] heights) {
        Map<Integer, String> map = new HashMap<>();
        for (int i = 0; i < names.length; i++) {
            map.put(heights[i], names[i]);
        }
        Arrays.sort(heights);
        for (int i = heights.length - 1; i >= 0; i--) {
            names[heights.length - 1 - i] = map.get(heights[i]);
        }
        return names;
    }
}
