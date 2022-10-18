package javacore.algorithm.leetcode.under2400;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * LeetCode 2363
 */
public class MergeSimilarItems {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int[] item : items1) {
            map.put(item[0], item[1]);
        }
        for (int[] item : items2) {
            map.merge(item[0], item[1], (cur, next) -> cur + next);
        }
        List<List<Integer>> ans = new ArrayList<>();
        map.forEach((k, v) -> ans.add(Arrays.asList(k, v)));
        Collections.sort(ans, (a, b) -> a.get(0) - b.get(0));
        return ans;
    }
}
