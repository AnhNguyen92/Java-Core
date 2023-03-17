package javacore.algorithm.leetcode.under1000;

/*
 * LeetCode 931. Minimum Falling Path Sum
 */
public class MinimumFallingPathSum {

    public int minFallingPathSum(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        for (int i = 1; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0) {
                    matrix[i][j] += Math.min(matrix[i-1][j], matrix[i-1][j+1]);
                } else if (j == n - 1) {
                    matrix[i][j] += Math.min(matrix[i-1][j-1], matrix[i-1][j]);
                } else {
                    matrix[i][j] += Math.min(matrix[i-1][j-1], Math.min(matrix[i-1][j], matrix[i-1][j+1]));
                }
            }
        }
        int min = matrix[m-1][0];
        for (int j = 1; j < n; j++) {
            if (matrix[m-1][j] < min) {
                min = matrix[m-1][j];
            }
        }
        return min;
    }

}
