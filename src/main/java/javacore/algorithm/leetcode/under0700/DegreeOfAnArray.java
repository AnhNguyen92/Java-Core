package javacore.algorithm.leetcode.under0700;

import java.util.HashMap;
import java.util.Map;

/*
 * LeetCode 697. Degree of an Array
 */
public class DegreeOfAnArray {
	public int findShortestSubArray(int[] nums) {
		Map<Integer, Integer> map = new HashMap<>();
		Map<Integer, Integer> fPMap = new HashMap<>();
		int minLen = nums.length;
		int max = 0;
		for (int i = 0; i < nums.length; i++) {
			if (!fPMap.containsKey(nums[i])) {
				fPMap.put(nums[i], i);
			} else {
				int appear = map.getOrDefault(nums[i], 1) + 1;
				map.put(nums[i], appear);

				if (appear > max) {
					max = appear;
					minLen = i - fPMap.get(nums[i]) + 1;
				} else if (appear == max) {
					int temp = i - fPMap.get(nums[i]) + 1;
					if (temp < minLen)
						minLen = temp;
				}
			}

		}
		if (map.size() == 0)
			return 1;
		return minLen;
	}
}
