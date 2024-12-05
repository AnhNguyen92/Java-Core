package javacore.algorithm.leetcode.under3300;

/**
 * 3212. Count Submatrices With Equal Frequency of X and Y
 */
public class CountSubmatricesWithEqualFrequencyOfXAndY {
    public int numberOfSubmatrices(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] arr = new int[m][n];
        boolean[][] xrr = new boolean[m][n];
        int ans = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 'X') {
                    arr[i][j] = -1;
                    xrr[i][j] = true;
                } else if (grid[i][j] == 'Y') {
                    arr[i][j] = 1;
                }
                if (j > 0) {
                    arr[i][j] += arr[i][j-1];
                    if (xrr[i][j-1])
                        xrr[i][j] = true;
                }
                if (i > 0) {
                    arr[i][j] += arr[i-1][j];
                    if (xrr[i-1][j])
                        xrr[i][j] = true;
                }
                if (j > 0 && i > 0) {
                    arr[i][j] -= arr[i-1][j-1];
                    if (xrr[i-1][j-1])
                        xrr[i][j] = true;
                }
            }
        }
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < m; i++) {
                if (arr[i][j] == 0 && xrr[i][j]) {
                    ans++;
                }
            }
        }
        return ans;
    }
}
