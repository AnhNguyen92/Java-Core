package javacore.algorithm.leetcode.under2400;

import java.util.HashMap;
import java.util.Map;

/*
 * LeetCode 2364. Count Number of Bad Pairs
 */
public class CountNumberOfBadPairs {
	public long countBadPairs(int[] nums) {
		Map<Long, Long> map = new HashMap<>();
		long n = nums.length;
		for (int i = 0; i < n; i++) {
			map.put((long) (nums[i] - i), map.getOrDefault((long) nums[i] - i, 0l) + 1l);
		}
		long ans = (n - 1) * n / 2;
		for (long x : map.values()) {
			if (x > 1l) {
				ans -= x * (x - 1) / 2;
			}
		}
		return ans;
	}
}
