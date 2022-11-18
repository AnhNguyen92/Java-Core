package javacore.algorithm.leetcode.under1700;

import java.util.HashMap;
import java.util.Map;

/*
 * LeetCode 1679. Max Number of K-Sum Pairs
 */
public class MaxNumberOfKSumPairs {

	public int maxOperations(int[] nums, int k) {
		Map<Integer, Integer> map = new HashMap<>();
		int count = 0;
		for (int i : nums) {
			if (map.containsKey(k - i)) {
				if (map.get(k - i) > 1) {
					map.put(k - i, map.get(k - i) - 1);
				} else {
					map.remove(k - i);
				}
				count++;
			} else {
				map.put(i, map.getOrDefault(i, 0) + 1);
			}
		}

		return count;
	}
}
