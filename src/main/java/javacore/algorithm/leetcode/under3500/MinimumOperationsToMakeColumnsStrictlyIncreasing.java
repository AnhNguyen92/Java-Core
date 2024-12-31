package javacore.algorithm.leetcode.under3500;

/**
 * 3402. Minimum Operations to Make Columns Strictly Increasing
 */
public class MinimumOperationsToMakeColumnsStrictlyIncreasing {
    public int minimumOperations(int[][] grid) {
        int ans = 0;
        for (int i = 1; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] <= grid[i-1][j]) {
                    ans += grid[i-1][j] - grid[i][j] + 1;
                    grid[i][j] = grid[i-1][j] + 1;
                }
            }
        }
        return ans;
    }
}
