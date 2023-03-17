package javacore.algorithm.leetcode.under2400;

/*
 * LeetCode 2319. Check if Matrix Is X-Matrix
 */
public class CheckIfMatrixIsXMatrix {
	public boolean checkXMatrix(int[][] grid) {
        int n = grid.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                 if (i == j || i == n - 1 - j) {
                    if (grid[i][j] == 0)
                        return false;
                } else {
                    if (grid[i][j] != 0) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
