package javacore.algorithm.leetcode.under0800;

/*
 * Leetcode 766. Toeplitz Matrix
 */
public class ToeplitzMatrix {
	public boolean isToeplitzMatrix(int[][] matrix) {
        for (int j = 1; j < matrix[0].length; j++) {
            int i = matrix.length - 1;
            int k = j;
            int val = matrix[i][k];
            while (k >= 0 && i >= 0) {
                if (matrix[i][k] != val) {
                    return false;
                }
                i--;
                k--;
            }
        }
        for (int i = matrix.length - 2; i >= 1; i--) {
            int j = matrix[0].length - 1;
            int k = i;
            int val = matrix[k][j];
            while (j >= 0 && k >= 0) {
                if (matrix[k][j] != val) {
                    return false;
                }
                k--;
                j--;
            }
        }
        return true;
    }
}
