package javacore.algorithm.leetcode.under3300;

/**
 * 3239. Minimum Number of Flips to Make Binary Grid Palindromic I
 */
public class MinimumNumberOfFlipsToMakeBinaryGridPalindromicI {
    public int minFlips(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int rCount = 0;
        for (int[] row : grid) {
            int diff = 0;
            for (int j = 0; j < n / 2; j++) {
                if (row[j] != row[n - 1 - j]) {
                    diff++;
                }
            }
            rCount += diff;
        }
        int cCount = 0;
        for (int j = 0; j < n; j++) {
            int diff = 0;
            for (int i = 0; i < m/2; i++) {
                if (grid[i][j] != grid[m-1-i][j]) {
                    diff++;
                }
            }
            cCount += diff;
        }
        return Math.min(rCount, cCount);
    }
}
