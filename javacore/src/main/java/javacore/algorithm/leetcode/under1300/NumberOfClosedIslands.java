package javacore.algorithm.leetcode.under1300;

/*
 * Leetcode 1254
 */
public class NumberOfClosedIslands {
	public int closedIsland(int[][] grid) {
		markBorderIsland(grid);

		int count = 0;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				if (grid[i][j] == 0) {
					markArr(grid, i, j);
					count++;
				}
			}
		}
		return count;
	}

	private void markBorderIsland(int[][] grid) {
		for (int i = 0; i < grid.length; i++) {
			if (grid[i][0] == 0) {
				markArr(grid, i, 0);
			}
			if (grid[i][grid[0].length - 1] == 0) {
				markArr(grid, i, grid[0].length - 1);
			}
		}
		for (int j = 0; j < grid[0].length; j++) {
			if (grid[0][j] == 0) {
				markArr(grid, 0, j);
			}
			if (grid[grid.length - 1][j] == 0) {
				markArr(grid, grid.length - 1, j);
			}
		}
	}

	private void markArr(int[][] grid, int i, int j) {
		if (grid[i][j] == 0) {
			grid[i][j] = 1;
			if (j < grid[i].length - 1) {
				markArr(grid, i, j + 1);
			}
			if (j > 0) {
				markArr(grid, i, j - 1);
			}
			if (i < grid.length - 1) {
				markArr(grid, i + 1, j);
			}
			if (i > 0) {
				markArr(grid, i - 1, j);
			}
		}
	}
}
