package javacore.algorithm.leetcode.under0500;

import java.util.Arrays;

/*
 * LeetCode 435. Non-overlapping Intervals
 */
public class NonOverlappingIntervals {
	public static int eraseOverlapIntervals(int[][] intervals) {
		Arrays.sort(intervals, (a, b) -> {
			if (a[1] != b[1]) {
				return a[1] - b[1];
			}
			return a[0] - b[0];
		});
		int count = 0;
		int k = Integer.MIN_VALUE;
		for (int i = 0; i < intervals.length; i++) {
			if (intervals[i][0] >= k) {
				k = intervals[i][1];
			} else {
				count++;
			}
		}
		return count;
	}
}
