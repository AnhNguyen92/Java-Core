package javacore.algorithm.leetcode.under2500;

/*
 * LeetCode 2482. Difference Between Ones and Zeros in Row and Column
 */
public class DifferenceBetweenOnesAndZerosInRowAndColumn {
	public int[][] onesMinusZeros(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] rows = new int[m][2];
        int[][] cols = new int[n][2];
        int[][] diff = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    rows[i][0]++;
                    cols[j][0]++;
                } else {
                    rows[i][1]++;
                    cols[j][1]++;
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                diff[i][j] = rows[i][0] + cols[j][0] - rows[i][1] - cols[j][1];
            }
        }
        return diff;
    }
}
