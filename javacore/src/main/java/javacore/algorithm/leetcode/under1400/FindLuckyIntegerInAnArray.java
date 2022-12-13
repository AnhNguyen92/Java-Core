package javacore.algorithm.leetcode.under1400;

import java.util.HashMap;
import java.util.Map;

/*
 * LeetCode 1394. Find Lucky Integer in an Array
 */
public class FindLuckyIntegerInAnArray {
	public int findLucky(int[] arr) {
		int[] count = new int[500];

		for (int i = 0; i < arr.length; i++) {
			count[arr[i] - 1]++;
		}

		for (int i = 499; i >= 0; i--) {
			if (count[i] == i + 1)
				return i + 1;
		}

		return -1;
	}

	public int findLucky1(int[] arr) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i : arr) {
			map.put(i, map.getOrDefault(i, 0) + 1);
		}
		int ans = -1;
		for (Integer key : map.keySet()) {
			Integer value = map.get(key);
			if (value.equals(key))
				if (ans < key.intValue()) {
					ans = key.intValue();
				}
		}
		return ans;
	}
}
