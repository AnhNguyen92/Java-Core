package javacore.algorithm.leetcode.under2700;

/*
 * LeetCode 2639. Find the Width of Columns of a Grid
 */
public class FindTheWidthOfColumnsOfAGrid {
	public int[] findColumnWidth(int[][] grid) {
        int[] ans = new int[grid[0].length];
        for (int j = 0; j < grid[0].length; j++) {
            for (int i = 0; i < grid.length; i++) {
                ans[j] = Math.max(ans[j], String.valueOf(grid[i][j]).length());
            }
        }
        return ans;
    }
}
