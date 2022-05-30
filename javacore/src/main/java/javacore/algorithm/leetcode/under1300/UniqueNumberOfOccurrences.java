package javacore.algorithm.leetcode.under1300;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
 * Leetcode 1275
 */
public class UniqueNumberOfOccurrences {
	public boolean uniqueOccurrences(int[] arr) {
		Map<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        int sumSet = 0;
        Set<Integer> set = new HashSet<>();
        map.forEach((key, value) -> set.add(value));
        int sum = map.values().stream().reduce(0, Integer::sum);
        for (Integer i : set) {
            sumSet += i.intValue();
        }
        return sum == sumSet;
    }
}
