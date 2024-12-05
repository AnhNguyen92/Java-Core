package javacore.algorithm.leetcode.under3100;

/**
 * 3070. Count Submatrices with Top-Left Element and Sum Less Than k
 */
public class CountSubmatricesWithTopLeftElementAndSumLessThanK {
    public int countSubmatrices(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] arr = new int[m][n];
        arr[0][0] = grid[0][0];
        int ans = 0;
        for (int i = 1; i < m; i++) {
            arr[i][0] = grid[i][0] + arr[i-1][0];
        }
        for (int j = 1; j < n; j++) {
            arr[0][j] = grid[0][j] + arr[0][j-1];
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                arr[i][j] = grid[i][j] + arr[i][j-1] + arr[i-1][j] - arr[i-1][j-1];
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                ans += (arr[i][j] <= k) ? 1 : 0;
            }
        }
        return ans;
    }
}
