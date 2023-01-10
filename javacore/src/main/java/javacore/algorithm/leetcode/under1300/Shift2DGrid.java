package javacore.algorithm.leetcode.under1300;

import java.util.ArrayList;
import java.util.List;

/*
 * LeetCode 1260. Shift 2D Grid
 */
public class Shift2DGrid {
	public List<List<Integer>> shiftGrid(int[][] grid, int k) {
		int r = grid.length;
		int c = grid[0].length;
		k = k % (r * c);
		int[][] arr = new int[r][c];
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				int col = (j + k) % c;
				int rol = (i + (j + k) / c) % r;
				arr[rol][col] = grid[i][j];
			}
		}
		List<List<Integer>> ans = new ArrayList<>();
		for (int i = 0; i < r; i++) {
			List<Integer> item = new ArrayList<>();
			for (int j = 0; j < c; j++) {
				item.add(arr[i][j]);
			}
			ans.add(item);
		}
		return ans;
	}
}
