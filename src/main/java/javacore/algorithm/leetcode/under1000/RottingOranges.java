package javacore.algorithm.leetcode.under1000;

import java.util.Arrays;

/**
 * 994. Rotting Oranges
 */
public class RottingOranges {
    int m, n;
    public int orangesRotting(int[][] grid) {
        m = grid.length;
        n = grid[0].length;
        int[][] ans = new int[m][n];
        int min = 60;

        for (int i = 0; i < m; i++)
            Arrays.fill(ans[i], min);

        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                if (grid[i][j] == 2)
                    travel(grid, ans, i, j, 0);

        min = 0;
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                if (grid[i][j] == 1)
                    min = Math.max(min, ans[i][j]);

        return (min == 60) ? -1 : min;
    }

    private void travel(int[][] grid, int[][] ans, int i, int j, int step) {
        ans[i][j] = Math.min(ans[i][j], step);
        if (j > 0 && grid[i][j-1] == 1 && ans[i][j-1] > step + 1) {
            travel(grid, ans, i, j - 1, step + 1);
        }
        if (j + 1 < n && grid[i][j+1] == 1 && ans[i][j+1] > step + 1) {
            travel(grid, ans, i, j + 1, step + 1);
        }
        if (i > 0 && grid[i-1][j] == 1 && ans[i-1][j] > step + 1) {
            travel(grid, ans, i - 1, j, step + 1);
        }
        if (i + 1 < m && grid[i + 1][j] == 1 && ans[i + 1][j] > step + 1) {
            travel(grid, ans, i + 1, j, step + 1);
        }
    }
}
