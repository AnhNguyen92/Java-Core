package javacore.algorithm.leetcode.under2400;

/*
 * LeetCode 2373. Largest Local Values in a Matrix
 */
public class LargestLocalValuesInAMatrix {
	public int[][] largestLocal(int[][] grid) {
		int n = grid.length;
		int m = n - 2;
		int max;
		int[][] res = new int[m][m];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < m; j++) {
				max = -1;
				for (int k = i; k <= i + 2; k++) {
					for (int t = j; t <= j + 2; t++) {
						max = Math.max(max, grid[k][t]);
					}
				}
				res[i][j] = max;
			}
		}
		return res;
	}
}
