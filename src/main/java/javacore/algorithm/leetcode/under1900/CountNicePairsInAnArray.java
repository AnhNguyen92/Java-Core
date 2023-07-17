package javacore.algorithm.leetcode.under1900;

import java.util.HashMap;
import java.util.Map;

/*
 * LeetCode 1814. Count Nice Pairs in an Array
 */
public class CountNicePairsInAnArray {
	public int countNicePairs(int[] nums) {
		Map<Integer, Integer> map = new HashMap<>();
		int n = nums.length;
		long count = 0;
		for (int i = 0; i < n; i++) {
			int rev = reverse(nums[i]);
			int prev = map.getOrDefault(nums[i] - rev, 0);
			count += prev;
			map.put(nums[i] - rev, prev + 1);
		}
		return (int) (count % 1000000007);
	}

	private int reverse(int n) {
		int x = 0;
		while (n > 0) {
			x = x * 10 + n % 10;
			n /= 10;
		}
		return x;
	}
}
