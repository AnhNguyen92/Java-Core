package javacore.algorithm.leetcode.under0200;

import java.util.HashMap;
import java.util.Map;

/*
 * LeetCode 137. Single Number II
 */
public class SingleNumberII {
	public int singleNumber(int[] nums) {
		Map<Integer, Integer> freqMap = new HashMap<>();
		for (int i : nums) {
			freqMap.put(i, freqMap.getOrDefault(i, 0) + 1);
		}
		return freqMap.entrySet().stream().filter(e -> e.getValue().equals(1)).map(Map.Entry::getKey).findFirst()
				.orElse(null);
	}
}
