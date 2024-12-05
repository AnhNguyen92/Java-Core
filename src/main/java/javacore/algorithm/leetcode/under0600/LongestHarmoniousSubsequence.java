package javacore.algorithm.leetcode.under0600;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
 * LeetCode 594. Longest Harmonious Subsequence
 */
public class LongestHarmoniousSubsequence {
	public int findLHS(int[] nums) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int n : nums) {
			map.put(n, map.getOrDefault(n, 0) + 1);
		}
		int count = 0;
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			Integer key = entry.getKey();
			Integer val = entry.getValue();
			if (map.get(key + 1) != null && map.get(key + 1) + val > count) {
				count = map.get(key + 1) + val;
			}
		}

		return count;
	}

	public int findLHS1(int[] nums) {
		Arrays.sort(nums);
		int count = 0;
		int i = 0;
		while (i < nums.length) {
			int j = nums.length - 1;
			while (j > i && nums[j] - nums[i] > 1) {
				j--;
			}
			if (nums[j] - nums[i] == 1 && j - i + 1 > count) {
				count = j - i + 1;
			}
			i++;
		}
		return count;
	}
}
