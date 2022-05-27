package javacore.algorithm.leetcode.under0100;

/*
 * LeetCode 73
 */
public class SetMatrixZeroes {
	public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] tempArr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0 && tempArr[i][j] == 0) {
                    for (int k = j - 1; k >= 0; k--) {
                        matrix[i][k] = 0;
                    }
                    for (int k = i - 1; k >= 0; k--) {
                        matrix[k][j] = 0;
                    }
                    for (int k = j + 1; k < n; k++) {
                        if (matrix[i][k] != 0) {
                            matrix[i][k] = 0;
                            tempArr[i][k] = 1;
                        }
                        
                    }
                    for (int k = i + 1; k < m; k++) {
                        if (matrix[k][j] != 0) {
                            matrix[k][j] = 0;
                            tempArr[k][j] = 1;
                        }
                    }
                }
            }
        }
    }
}