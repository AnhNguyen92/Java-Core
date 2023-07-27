package javacore.algorithm.leetcode.under0500;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
 * LeetCode 436. Find Right Interval
 */
public class FindRightInterval {
	public int[] findRightInterval(int[][] intervals) {
		Map<int[], Integer> map = new HashMap<>();
		int[] ans = new int[intervals.length];
		for (int i = 0; i < intervals.length; i++) {
			map.put(intervals[i], i);
			ans[i] = -1;
		}
		Arrays.sort(intervals, (a, b) -> {
			if (a[0] != b[0]) {
				return a[0] - b[0];
			}
			return a[1] - b[1];
		});
		int x;
		for (int i = 0; i < intervals.length; i++) {
			x = map.get(intervals[i]);
			if (intervals[i][0] == intervals[i][1]) {
				ans[x] = x;
			} else {
				for (int j = i + 1; j < intervals.length; j++) {
					if (intervals[j][0] >= intervals[i][1]) {
						ans[x] = map.get(intervals[j]);
						break;
					}
				}
			}
		}
		return ans;
	}
}
