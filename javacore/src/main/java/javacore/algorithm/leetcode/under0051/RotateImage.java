package javacore.algorithm.leetcode.under0051;

/*
 * LeetCode 48. Rotate Image
 */
public class RotateImage {
	public void rotate(int[][] matrix) {
        int[][] arr = new int[matrix.length][matrix[0].length];
        int n = matrix.length - 1;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                arr[j][n - i] = matrix[i][j];
            }
        }
        for (int i = 0; i <= n; i++) {
        	System.arraycopy(arr[i], 0, matrix[i], 0, n);
        }
    }
}
