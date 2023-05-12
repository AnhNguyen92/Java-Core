package javacore.algorithm.leetcode.under2400;

import java.util.HashMap;
import java.util.Map;

/*
 * LeetCode 2352. Equal Row and Column Pairs
 */
public class EqualRowAndColumnPairs {
	public int equalPairs(int[][] grid) {
		Map<String, Integer> map = new HashMap<>();
		for (int i = 0; i < grid.length; i++) {
			StringBuilder sb = new StringBuilder();
			for (int j = 0; j < grid[0].length; j++) {
				sb.append(grid[i][j]).append(",");
			}
			String s = sb.toString();
			map.put(s, map.getOrDefault(s, 0) + 1);
		}
		int count = 0;
		for (int j = 0; j < grid[0].length; j++) {
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < grid.length; i++) {
				sb.append(grid[i][j]).append(",");
			}
			count += map.getOrDefault(sb.toString(), 0);
		}
		return count;
	}
}
