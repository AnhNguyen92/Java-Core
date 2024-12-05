package javacore.algorithm.leetcode.under2700;

/**
 * 2684. Maximum Number of Moves in a Grid
 */
public class MaximumNumberOfMovesInAGrid {
    public int maxMoves(int[][] grid) {
        int[][] dp = new int[grid.length][grid[0].length];
        int max = 0;
        for (int j = grid[0].length - 2; j >= 0; j--) {
            for (int i = grid.length - 1; i >= 0; i--) {
                for (int k = Math.max(0, i - 1); k <= Math.min(i + 1, grid.length - 1); k++) {
                    if (grid[i][j] < grid[k][j + 1])
                        dp[i][j] = Math.max(dp[i][j], dp[k][j + 1] + 1);
                }
            }
        }

        for (int i = 0; i < dp.length; i++) {
            max = Math.max(max, dp[i][0]);
        }
        return max;
    }
}
