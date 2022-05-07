package javacore.algorithm.leetcode.under900;

/*
 * LeetCode 807
 */
public class MaxIncreaseToKeepCitySkyline {
	public int maxIncreaseKeepingSkyline(int[][] grid) {
		int[] t = new int[grid.length];
		int[] l = new int[grid[0].length];
		for (int i = 0; i < grid.length; i++)
			for (int j = 0; j < grid[i].length; j++) {
				t[j] = Math.max(t[j], grid[i][j]);
				l[i] = Math.max(l[i], grid[i][j]);
			}
		int sum = 0;
		for (int i = 0; i < grid.length; i++)
			for (int j = 0; j < grid[i].length; j++)
				sum += Math.min(t[j], l[i]) - grid[i][j];
		return sum;
	}
}
