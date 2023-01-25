package javacore.algorithm.leetcode.under1100;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

/*
 * LeetCode 1054. Distant Barcodes
 */
public class DistantBarcodes {
	public int[] rearrangeBarcodes(int[] barcodes) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : barcodes) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        Map<Integer, Integer> sorted = map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));
        int idx = 0;
        for (Map.Entry<Integer, Integer> entry : sorted.entrySet()) {
            int count = entry.getValue();
            int key = entry.getKey();
            while (count > 0) {
                barcodes[idx] = key;
                idx += 2;
                count--;
                if (idx >= barcodes.length) {
                    idx = 1;
                }
            }
        }
        return barcodes;
    }
}
