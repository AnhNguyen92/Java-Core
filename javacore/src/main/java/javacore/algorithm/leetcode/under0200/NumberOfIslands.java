package javacore.algorithm.leetcode.under0200;

/*
 * LeetCode 200
 */
public class NumberOfIslands {

	public int numIslands(char[][] grid) {
		int count = 0;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				if (grid[i][j] == '1') {
					markArr(grid, i, j);
					count++;
				}
			}
		}
		return count;
	}

	private void markArr(char[][] grid, int i, int j) {
		if (grid[i][j] == '1') {
			grid[i][j] = '2';
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
