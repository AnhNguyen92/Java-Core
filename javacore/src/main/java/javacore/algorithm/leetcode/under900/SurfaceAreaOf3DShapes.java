package javacore.algorithm.leetcode.under900;

/*
 * LeetCode 892
 */
public class SurfaceAreaOf3DShapes {
	public int surfaceArea(int[][] grid) {
		int count = 0;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				if (grid[i][j] > 0) {
					count += 2;
					int l = j == 0 ? grid[i][j] : (grid[i][j] - grid[i][j - 1] > 0 ? (grid[i][j] - grid[i][j - 1]) : 0);
					int r = j == (grid[i].length - 1) ? grid[i][j]
							: (grid[i][j] - grid[i][j + 1] > 0 ? (grid[i][j] - grid[i][j + 1]) : 0);
					int f = i == (grid.length - 1) ? grid[i][j]
							: (grid[i][j] - grid[i + 1][j] > 0 ? (grid[i][j] - grid[i + 1][j]) : 0);
					int b = i == 0 ? grid[i][j] : (grid[i][j] - grid[i - 1][j] > 0 ? (grid[i][j] - grid[i - 1][j]) : 0);
					count += l + r + b + f;
				}
			}
		}
		return count;
	}
}
