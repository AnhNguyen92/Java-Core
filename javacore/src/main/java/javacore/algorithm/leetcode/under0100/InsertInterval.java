package javacore.algorithm.leetcode.under0100;

import java.util.LinkedList;

/*
 * LeetCode 57. Insert Interval
 */
public class InsertInterval {
	public int[][] insert(int[][] intervals, int[] newInterval) {
		LinkedList<int[]> merged = new LinkedList<>();
		int i = 0;
		while (i < intervals.length && intervals[i][1] < newInterval[0]) {
			merged.add(intervals[i]);
			i++;
		}
		merged.add(newInterval);
		for (; i < intervals.length; i++) {
			int[] interval = intervals[i];
			if (merged.getLast()[1] < interval[0]) {
				merged.add(interval);
			} else {
				merged.getLast()[0] = Math.min(merged.getLast()[0], interval[0]);
				merged.getLast()[1] = Math.max(merged.getLast()[1], interval[1]);
			}

		}
		return merged.toArray(new int[merged.size()][]);
	}
}
