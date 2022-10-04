package javacore.algorithm.leetcode.under2500;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
 * LeetCode 2404
 */
public class MostFrequentEvenElement {
    public int mostFrequentEven(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            if (i % 2 == 0) {
                map.merge(i, 1, Integer::sum);
            }
        }
        if (map.size() == 0) {
            return -1;
        }
        final Comparator<Map.Entry<Integer, Integer>> byValue =
                Comparator.comparing(Map.Entry::getValue, Comparator.reverseOrder());
        final Comparator<Map.Entry<Integer, Integer>> byKey =
                Comparator.comparing(Map.Entry::getKey);
        List<Integer> lst =
                map.entrySet().stream()
                        .sorted(byValue.thenComparing(byKey))
                        .map(Map.Entry::getKey)
                        .collect(Collectors.toList());
        return lst.get(0);
    }
}
