package javacore.algorithm.leetcode.under900;

/*
 * LeetCode 883
 */
public class ProjectionAreaOf3DShapes {
	public int projectionArea(int[][] grid) {
		if (grid.length == 1)
			return grid[0][0] * 2 + 1;
		int count = 0;
		int[] row = new int[grid.length];
		int[] col = new int[grid[0].length];
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				if (grid[i][j] > 0)
					count++;
				row[i] = Math.max(row[i], grid[i][j]);
				col[j] = Math.max(col[j], grid[i][j]);
			}
		}
		for (int i : row) {
			count += i;
		}
		for (int i : col) {
			count += i;
		}
		return count;
	}
}
