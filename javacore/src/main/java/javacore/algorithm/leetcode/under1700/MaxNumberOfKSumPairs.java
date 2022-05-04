package javacore.algorithm.leetcode.under1700;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * LeetCode 1679
 */
public class MaxNumberOfKSumPairs {
	public static void main(String[] args) {
		int[] nums = new int[] { 3, 1, 3, 4, 3 };
		int k = 6;
		System.out.println(maxOperations(nums, k));
	}

	public static int maxOperations(int[] nums, int k) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i : nums) {
			map.put(i, map.getOrDefault(i, 0) + 1);
		}
		int count = 0;
		List<Integer> lst = new ArrayList<>();
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			Integer key = entry.getKey();
			if (!lst.contains(key)) {
				lst.add(key);
				if (map.containsKey(k - key.intValue())) {
					Integer val = entry.getValue();
					if (val.intValue() * 2 == k) {
						count += val / 2;
					} else {
						lst.add(k - key.intValue());
						count += Math.min(map.get(k - key.intValue()).intValue(), val.intValue());
					}
				}
			}

		}
		return count;
	}
}
