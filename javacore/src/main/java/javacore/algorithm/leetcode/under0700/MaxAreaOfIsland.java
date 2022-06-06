package javacore.algorithm.leetcode.under0700;

/*
 * LeetCode 695
 */
public class MaxAreaOfIsland {
	public int maxAreaOfIsland(int[][] grid) {
		int row = grid.length;
		int col = grid[0].length;
		int max = 0;
		int count;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (grid[i][j] == 1) {
					count = dfs(grid, i, j, row, col, 0);
					max = Math.max(max, count);
				}
			}
		}
		return max;
	}

	private int dfs(int[][] grid, int r, int c, int nr, int nc, int count) {
		grid[r][c] = 0;
		count++;
		if (r - 1 >= 0 && grid[r - 1][c] == 1) {
			count = dfs(grid, r - 1, c, nr, nc, count);
		}
		if (r + 1 < nr && grid[r + 1][c] == 1) {
			count = dfs(grid, r + 1, c, nr, nc, count);
		}
		if (c - 1 >= 0 && grid[r][c - 1] == 1) {
			count = dfs(grid, r, c - 1, nr, nc, count);
		}
		if (c + 1 < nc && grid[r][c + 1] == 1) {
			count = dfs(grid, r, c + 1, nr, nc, count);
		}
		return count;
	}
}
