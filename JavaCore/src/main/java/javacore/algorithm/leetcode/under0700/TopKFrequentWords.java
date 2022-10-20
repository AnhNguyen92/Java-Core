package javacore.algorithm.leetcode.under0700;

import java.util.*;
import java.util.stream.Collectors;

/*
 * LeetCode 692
 */
public class TopKFrequentWords {

    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> frequency = new LinkedHashMap<>();
        for (int i = 0; i < words.length; i++) {
            if (frequency.containsKey(words[i])) {
                frequency.put(words[i], frequency.get(words[i]) + 1);
            } else {
                frequency.put(words[i], 1);
            }
        }
        Comparator<Map.Entry<String, Integer>> byValue =
                Comparator.comparing(Map.Entry::getValue, Comparator.reverseOrder());
        Comparator<Map.Entry<String, Integer>> byKey =
                Comparator.comparing(Map.Entry::getKey);
        Map<String, Integer> map = frequency.entrySet().stream().sorted(byValue.thenComparing(byKey)).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                (oldValue, newValue) -> oldValue, LinkedHashMap::new));
        ArrayList<String> ans = new ArrayList<>();

        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            if (k > 0) {
                ans.add(entry.getKey());
                k--;
            } else {
                break;
            }
        }

        return ans;
    }
}
