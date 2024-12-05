package javacore.algorithm.leetcode.under1100;

/**
 * 1020. Number of Enclaves
 */
public class NumberOfEnclaves {
    public int numEnclaves(int[][] grid) {
        int count = 0;
        int m = grid.length;
        int n = grid[0].length;
        for (int i = 0; i < m; i++) {
            if (grid[i][0] == 1) {
                traverse(grid, i, 0, m, n);
            }
            if (grid[i][n - 1] == 1) {
                traverse(grid, i, n - 1, m, n);
            }
        }
        for (int i = 0; i < n; i++) {
            if (grid[0][i] == 1) {
                traverse(grid, 0, i, m, n);
            }
            if (grid[m - 1][i] == 1) {
                traverse(grid, m - 1, i, m, n);
            }
        }
        for (int i = 1; i < m - 1; i++) {
            for (int j = 1; j < n - 1; j++) {
                if (grid[i][j] == 1) {
                    count++;
                }
            }
        }
        return count;
    }

    private void traverse(int[][] grid, int i, int j, int m, int n) {
        grid[i][j] = 0;
        if (i + 1 < m && grid[i + 1][j] == 1) {
            traverse(grid, i + 1, j, m, n);
        }
        if (i > 0 && grid[i - 1][j] == 1) {
            traverse(grid, i - 1, j, m, n);
        }
        if (j + 1 < n && grid[i][j + 1] == 1) {
            traverse(grid, i, j + 1, m, n);
        }
        if (j > 0 && grid[i][j - 1] == 1) {
            traverse(grid, i, j - 1, m, n);
        }
    }
}
